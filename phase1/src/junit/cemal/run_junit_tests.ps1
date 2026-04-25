# ============================================================
# JUnit 5 Test Runner Script for Cemal's Tasks
# Compiles each Solution with its JUnit test and runs it
# ============================================================

$ErrorActionPreference = "Continue"

$BASE_DIR = $PSScriptRoot
$JUNIT_JAR = "$BASE_DIR\junit-platform-console-standalone-6.0.3.jar"
$BUILD_DIR = "$BASE_DIR\build"
$SRC_DIR = "$BASE_DIR\..\..\gemini\cemal" # Test edilecek kaynak kod dizini (gemini veya claude olabilir)

# Gerekli JUnit Standalone JAR dosyasını indir (Eğer yoksa)
if (-not (Test-Path $JUNIT_JAR)) {
    Write-Host "Downloading JUnit 6.0.3 Console Standalone JAR..." -ForegroundColor Cyan
    Invoke-WebRequest -Uri "https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/6.0.3/junit-platform-console-standalone-6.0.3.jar" -OutFile $JUNIT_JAR
}

# Temizlik
if (Test-Path $BUILD_DIR) { Remove-Item -Recurse -Force $BUILD_DIR }
New-Item -ItemType Directory -Force -Path $BUILD_DIR | Out-Null

Write-Host ""
Write-Host "============================================================" -ForegroundColor Cyan
Write-Host "  Running JUnit 6 Tests - Cemal (10 Tasks)" -ForegroundColor Cyan
Write-Host "============================================================" -ForegroundColor Cyan
Write-Host ""

$tasks = @(
    @{ Name = "Java3";       Src = "Java3_belowZero.java";       Test = "TestJava3JUnit.java" },
    @{ Name = "Java45";      Src = "Java45_triangleArea.java";   Test = "TestJava45JUnit.java" },
    @{ Name = "Java52";      Src = "Java52_belowThreshold.java"; Test = "TestJava52JUnit.java" },
    @{ Name = "Java53";      Src = "Java53_add.java";            Test = "TestJava53JUnit.java" },
    @{ Name = "Java64";      Src = "Java64_vowelsCount.java";    Test = "TestJava64JUnit.java" },
    @{ Name = "Java79";      Src = "Java79_decimalToBinary.java";Test = "TestJava79JUnit.java" },
    @{ Name = "Java85";      Src = "Java85_add.java";            Test = "TestJava85JUnit.java" },
    @{ Name = "Java109";     Src = "Java109_moveOneBall.java";   Test = "TestJava109JUnit.java" },
    @{ Name = "Java119";     Src = "Java119_matchParens.java";   Test = "TestJava119JUnit.java" },
    @{ Name = "Java124";     Src = "Java124_validDate.java";     Test = "TestJava124JUnit.java" }
)

foreach ($task in $tasks) {
    $taskName = $task.Name
    $srcFile  = "$SRC_DIR\$($task.Src)"
    $testFile = "$BASE_DIR\$($task.Test)"
    $taskBuildDir = "$BUILD_DIR\$taskName"
    
    Write-Host "--- [$taskName] ---" -ForegroundColor Yellow

    # 1. Create isolated build directory (çünkü hepsi 'class Solution' tanımlıyor)
    New-Item -ItemType Directory -Force -Path $taskBuildDir | Out-Null

    # 2. Compile source + test
    Write-Host "  Compiling..." -NoNewline
    $compileOutput = & javac -cp $JUNIT_JAR -d $taskBuildDir $srcFile $testFile 2>&1
    if ($LASTEXITCODE -ne 0) {
        Write-Host " FAILED" -ForegroundColor Red
        Write-Host "  $compileOutput" -ForegroundColor Red
        continue
    }
    Write-Host " OK" -ForegroundColor Green

    # 3. Run JUnit tests
    Write-Host "  Running tests..." 
    $testClassName = [System.IO.Path]::GetFileNameWithoutExtension($task.Test)
    & java -jar $JUNIT_JAR execute -cp $taskBuildDir --select-class $testClassName --details=tree
    Write-Host ""
}

# Temizlik
if (Test-Path $BUILD_DIR) { Remove-Item -Recurse -Force $BUILD_DIR }
Write-Host "All tests finished!" -ForegroundColor Green
