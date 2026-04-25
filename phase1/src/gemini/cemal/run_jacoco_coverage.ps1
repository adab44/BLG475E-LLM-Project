# ============================================================
# JaCoCo Branch Coverage Script for Gemini/Cemal Tasks
# Runs each task individually and generates HTML + CSV reports
# ============================================================

$ErrorActionPreference = "Continue"

# Paths
$BASE_DIR = $PSScriptRoot
$JACOCO_AGENT = "$BASE_DIR\jacoco-agent.jar"
$JACOCO_CLI = "$BASE_DIR\jacoco-cli.jar"
$REPORT_DIR = "$BASE_DIR\jacoco-reports"
$BUILD_DIR = "$BASE_DIR\build"

# Task definitions: source file -> test file
$tasks = @(
    @{ Name = "Java3_belowZero";       Src = "Java3_belowZero.java";       Test = "TestJava3.java" },
    @{ Name = "Java45_triangleArea";    Src = "Java45_triangleArea.java";    Test = "TestJava45.java" },
    @{ Name = "Java52_belowThreshold";  Src = "Java52_belowThreshold.java";  Test = "TestJava52.java" },
    @{ Name = "Java53_add";             Src = "Java53_add.java";             Test = "TestJava53.java" },
    @{ Name = "Java64_vowelsCount";     Src = "Java64_vowelsCount.java";     Test = "TestJava64.java" },
    @{ Name = "Java79_decimalToBinary"; Src = "Java79_decimalToBinary.java";  Test = "TestJava79.java" },
    @{ Name = "Java85_add";             Src = "Java85_add.java";             Test = "TestJava85.java" },
    @{ Name = "Java109_moveOneBall";    Src = "Java109_moveOneBall.java";    Test = "TestJava109.java" },
    @{ Name = "Java119_matchParens";    Src = "Java119_matchParens.java";    Test = "TestJava119.java" },
    @{ Name = "Java124_validDate";      Src = "Java124_validDate.java";      Test = "TestJava124.java" }
)

# Clean and create directories
if (Test-Path $REPORT_DIR) { Remove-Item -Recurse -Force $REPORT_DIR }
if (Test-Path $BUILD_DIR)  { Remove-Item -Recurse -Force $BUILD_DIR }
New-Item -ItemType Directory -Force -Path $REPORT_DIR | Out-Null

Write-Host ""
Write-Host "============================================================" -ForegroundColor Cyan
Write-Host "  JaCoCo Branch Coverage - Gemini/Cemal (10 Tasks)" -ForegroundColor Cyan
Write-Host "============================================================" -ForegroundColor Cyan
Write-Host ""

$summaryData = @()
$allPassed = $true

foreach ($task in $tasks) {
    $taskName = $task.Name
    $srcFile  = "$BASE_DIR\$($task.Src)"
    $testFile = "$BASE_DIR\$($task.Test)"
    $taskBuildDir  = "$BUILD_DIR\$taskName"
    $taskReportDir = "$REPORT_DIR\$taskName"
    $execFile = "$taskBuildDir\jacoco.exec"

    Write-Host "--- [$taskName] ---" -ForegroundColor Yellow

    # 1. Create build directory
    New-Item -ItemType Directory -Force -Path $taskBuildDir | Out-Null

    # 2. Compile source + test together
    Write-Host "  Compiling..." -NoNewline
    $compileOutput = & javac -d $taskBuildDir $srcFile $testFile 2>&1
    if ($LASTEXITCODE -ne 0) {
        Write-Host " FAILED" -ForegroundColor Red
        Write-Host "  $compileOutput" -ForegroundColor Red
        $summaryData += [PSCustomObject]@{
            Task = $taskName; Status = "COMPILE_FAIL";
            BranchCov = "N/A"; BranchMissed = "N/A"; BranchTotal = "N/A";
            LineCov = "N/A"
        }
        $allPassed = $false
        continue
    }
    Write-Host " OK" -ForegroundColor Green

    # 3. Run test with JaCoCo agent
    Write-Host "  Running test..." -NoNewline
    $testClassName = [System.IO.Path]::GetFileNameWithoutExtension($task.Test)
    $javaAgent = "-javaagent:$JACOCO_AGENT=destfile=$execFile"
    $runOutput = & java $javaAgent -cp $taskBuildDir $testClassName 2>&1
    $testExitCode = $LASTEXITCODE
    if ($testExitCode -ne 0) {
        Write-Host " FAILED" -ForegroundColor Red
        Write-Host "  $runOutput" -ForegroundColor Red
        $summaryData += [PSCustomObject]@{
            Task = $taskName; Status = "TEST_FAIL";
            BranchCov = "N/A"; BranchMissed = "N/A"; BranchTotal = "N/A";
            LineCov = "N/A"
        }
        $allPassed = $false
        continue
    }
    Write-Host " PASSED" -ForegroundColor Green

    # 4. Generate HTML report (only for Solution class, not test class)
    Write-Host "  Generating report..." -NoNewline
    New-Item -ItemType Directory -Force -Path $taskReportDir | Out-Null

    # Generate HTML report
    & java -jar $JACOCO_CLI report $execFile `
        --classfiles $taskBuildDir\Solution.class `
        --sourcefiles $BASE_DIR `
        --html $taskReportDir `
        --name "$taskName" 2>&1 | Out-Null

    # Generate CSV report for parsing
    $csvFile = "$taskReportDir\report.csv"
    & java -jar $JACOCO_CLI report $execFile `
        --classfiles $taskBuildDir\Solution.class `
        --sourcefiles $BASE_DIR `
        --csv $csvFile `
        --name "$taskName" 2>&1 | Out-Null

    Write-Host " OK" -ForegroundColor Green

    # 5. Parse CSV for branch coverage
    if (Test-Path $csvFile) {
        $csv = Import-Csv $csvFile
        $totalBranchMissed = 0
        $totalBranchCovered = 0
        $totalLineMissed = 0
        $totalLineCovered = 0
        foreach ($row in $csv) {
            $totalBranchMissed  += [int]$row.BRANCH_MISSED
            $totalBranchCovered += [int]$row.BRANCH_COVERED
            $totalLineMissed    += [int]$row.LINE_MISSED
            $totalLineCovered   += [int]$row.LINE_COVERED
        }
        $totalBranches = $totalBranchMissed + $totalBranchCovered
        $totalLines = $totalLineMissed + $totalLineCovered
        if ($totalBranches -gt 0) {
            $branchPct = [math]::Round(($totalBranchCovered / $totalBranches) * 100, 1)
        } else {
            $branchPct = "N/A (no branches)"
        }
        if ($totalLines -gt 0) {
            $linePct = [math]::Round(($totalLineCovered / $totalLines) * 100, 1)
        } else {
            $linePct = "N/A"
        }

        $summaryData += [PSCustomObject]@{
            Task        = $taskName
            Status      = "PASS"
            BranchCov   = "$branchPct%"
            BranchMissed = $totalBranchMissed
            BranchTotal = $totalBranches
            LineCov     = "$linePct%"
        }

        Write-Host "  Branch Coverage: $branchPct% ($totalBranchCovered/$totalBranches)" -ForegroundColor Cyan
        Write-Host "  Line Coverage:   $linePct% ($totalLineCovered/$totalLines)" -ForegroundColor Cyan
    } else {
        $summaryData += [PSCustomObject]@{
            Task = $taskName; Status = "NO_CSV";
            BranchCov = "N/A"; BranchMissed = "N/A"; BranchTotal = "N/A";
            LineCov = "N/A"
        }
    }
    Write-Host ""
}

# ============================================================
# Summary Table
# ============================================================
Write-Host ""
Write-Host "============================================================" -ForegroundColor Cyan
Write-Host "  BRANCH COVERAGE SUMMARY" -ForegroundColor Cyan
Write-Host "============================================================" -ForegroundColor Cyan
Write-Host ""

$summaryData | Format-Table -AutoSize

# Save summary CSV
$summaryCsvPath = "$REPORT_DIR\summary.csv"
$summaryData | Export-Csv -Path $summaryCsvPath -NoTypeInformation
Write-Host "Summary CSV saved to: $summaryCsvPath" -ForegroundColor Green
Write-Host "HTML reports saved to: $REPORT_DIR\<TaskName>\index.html" -ForegroundColor Green
Write-Host ""

# Cleanup build dir
if (Test-Path $BUILD_DIR) { Remove-Item -Recurse -Force $BUILD_DIR }

Write-Host "Done!" -ForegroundColor Green
