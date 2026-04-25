# BLG 475E – SOFTWARE QUALITY AND TESTING PROJECT

## LLM-BASED TESTING PIPELINE (SPRING 2025–2026)

This project evaluates the performance of Large Language Models (LLMs) in generating Java code and improving test suites through both automated and manual analysis.

---

## 👥 TEAM MEMBERS

* **CEMAL YILMAZ** – 820210317
* **ADA KAYNAK** - 820210314
* **VEYSEL ÇELİK** – 150210702
---

## 💻 DEVELOPMENT ENVIRONMENT SETUP

To ensure consistency across the team and successful execution of the testing pipeline, please set up your environment as follows:

### 1. Prerequisite Software
* **Java Development Kit (JDK):** Install **JDK 17 or 21** (LTS versions). Ensure your `JAVA_HOME` environment variable is set correctly.
* **IDE:** **VS Code** is recommended for this project.

### 2. Recommended VS Code Extensions
Install the **Extension Pack for Java** from Microsoft, which includes:
* **Language Support for Java™ by Red Hat**: For code completion and error checking.
* **Debugger for Java**: For troubleshooting logic in your solutions.
* **Test Runner for Java**: To execute JUnit tests directly from the Sidebar.

### 3. Project Configuration
* When adding your assigned tasks, follow the established directory structure:
  * Source code & Tests: `phase1/src/`

---

## 📂 PHASE 1: SELECTED "EASY" PROMPTS

We selected 30 prompts from the **HumanEval-Java** dataset. Below are the first 10 prompts categorized as *Easy*:

| ID       | Method             | Description                         | Assigned To  |
| -------- | ------------------ | ----------------------------------- | ------------ |
| Java/15  | `stringSequence`   | Sequence from 0 to n                | VEYSEL ÇELİK |
| Java/23  | `strlen`           | String length *(Mandatory)*         | VEYSEL ÇELİK |
| Java/27  | `flipCase`         | Upper-lower case swap *(Mandatory)* | VEYSEL ÇELİK |
| Java/34  | `uniqueSorted`     | Unique sorted list                  | VEYSEL ÇELİK |
| Java/45  | `triangleArea`     | Area calculation                    | CEMAL YILMAZ |
| Java/53  | `add`              | Simple addition                     | CEMAL YILMAZ |
| Java/79  | `decimalToBinary`  | Binary conversion                   | CEMAL YILMAZ |
| Java/97  | `multiplyDigit`    | Digit multiplication                | ADA KAYNAK   |
| Java/100 | `makeAPile`        | Stone pile logic                    | ADA KAYNAK   |
| Java/138 | `isEqualToSumEven` | Sum of 4 even numbers               | ADA KAYNAK   |



| ID      | Method                    | Description                               | Assigned To  |
| ------- | ------------------------- | ----------------------------------------- | ------------ |
| Java/3  | `belowZero`               | Check if cumulative sum goes below zero   | CEMAL YILMAZ |
| Java/16 | `countDistinctCharacters` | Count distinct characters in string       | VEYSEL ÇELİK |
| Java/18 | `howManyTimes`            | Count occurrences of substring            | VEYSEL ÇELİK |
| Java/32 | `findZero`                | Find root of polynomial                   | VEYSEL ÇELİK |
| Java/44 | `changeBase`              | Convert number to given base              | ADA KAYNAK   |
| Java/48 | `isPalindrome`            | Check if string is palindrome             | VEYSEL ÇELİK |
| Java/52 | `belowThreshold`          | Check if all elements are below threshold | CEMAL YILMAZ |
| Java/57 | `monotonic`               | Check if list is monotonic                | ADA KAYNAK   |
| Java/64 | `vowelsCount`             | Count vowels in string                    | CEMAL YILMAZ |
| Java/85 | `add`                     | Conditional sum of list elements          | CEMAL YILMAZ |


| ID       | Method            | Description                                   | Assigned To  |
| -------- | ----------------- | --------------------------------------------- | ------------ |
| Java/87  | `getRow`          | Extract row from 2D list                      | VEYSEL ÇELİK |
| Java/93  | `encode`          | Encode string with transformation rules       | VEYSEL ÇELİK |
| Java/102 | `chooseNum`       | Select valid number between bounds            | VEYSEL ÇELİK |
| Java/109 | `moveOneBall`     | Check if array can be sorted by rotation      | CEMAL YILMAZ |
| Java/119 | `matchParens`     | Validate matching parentheses patterns        | CEMAL YILMAZ |
| Java/124 | `validDate`       | Validate date format and correctness          | CEMAL YILMAZ |
| Java/140 | `fixSpaces`       | Normalize spacing in string                   | ADA KAYNAK   |
| Java/145 | `orderByPoints`   | Sort numbers by digit sum                     | ADA KAYNAK   |
| Java/154 | `cycpatternCheck` | Check cyclic pattern match                    | ADA KAYNAK   |
| Java/160 | `doAlgebra`       | Evaluate expression from operators & operands | ADA KAYNAK   |



---

## 🛠 TECH STACK

* **Language:** Java
* **Testing Framework:** JUnit 6
* **Documentation:** IEEE Journal Template

---

## 📝 WORKFLOW

* **LLM Interaction:**
  All prompts and generated responses are logged and stored in the repository.

* **Analysis:**

  * Branch Coverage
  * Black-box Testing

    * Equivalence Partitioning
    * Boundary Value Analysis

* **Version Control:**
  Each development step is tracked with clear and descriptive commit messages.

---

## 📅 DEADLINES

* **PHASE 1:** April 27, 2026
* **PHASE 2 (FINAL):** May 25, 2026

---
