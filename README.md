# Software Seni

## Description
This project is a test automation suite designed to validate response code and JSON schema using RestAssured, Cucumber, and JUnit 4. The project follows the Page Object Model (POM) structure, making the test cases modular and easy to maintain.

## Approach
1. **Page Object Model (POM):**
   Each web page used in the tests has a corresponding page class, which encapsulates the page's elements and actions. This approach improves code reusability and readability, as well as simplifies the maintenance of test scripts.
2. **Cucumber BDD:**
   Cucumber is used for Behavior-Driven Development (BDD), allowing us to write test scenarios in a human-readable format. Each scenario represents a specific user flow, written in Gherkin syntax, making it easy to understand for both technical and non-technical stakeholders.
3. **JUnit 4 for Test Execution:**
   JUnit 4 is used to run the Cucumber tests, providing powerful test filtering options.

## Prerequisites
Before running the project, ensure you have the following installed:
1. **Java Development Kit (JDK)** (v8 or later)
2. **Apache Maven**
3. **Git**

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/steven-y-h/software-seni-cucumber-restassured.git
   cd <repository-folder>
   ```
2. Install dependencies:
   ```bash
   mvn clean install
   ```

## How to Run Tests

### Run All Tests
To execute all tests:
```bash
mvn test
```

### Run Tests for a Specific Tag
To execute tests with a specific tag:
```bash
mvn test -Dcucumber.filter.tags="@tagName"
```
Replace `@tagName` with the tag of the feature/scenario you want to run.

### Generate Reports
Maven automatically generates reports in the `target` directory. For detailed Cucumber reports:
1. Navigate to `target/`.
2. Open the `cucumber-report.html` file in your browser to view the report.