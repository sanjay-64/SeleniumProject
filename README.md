\# Selenium Automation Framework



Overview

This is a Maven-based Selenium Automation Framework developed using Java and TestNG.
It follows the Page Object Model (POM) design pattern and is built to support scalable, maintainable, and reusable automated test execution for web applications.

The framework supports Excel based test data handling, rich HTML reporting using ExtentReports, and automatic browser driver management through WebDriverManager.



---



Tech Stack

Java 17
Selenium 4.21.0
TestNG 7.9.0
Apache POI 5.2.5 (Excel handling)
ExtentReports 5.1.1 (HTML reporting)
WebDriverManager 5.8.0
Maven
GitHub

---



\## Project Structure



Project Structure

SeleniumProject

src/main/java/com/automation/pages
Contains all Page Object classes representing application screens

src/main/java/com/automation/utilities
Contains reusable utility classes such as Excel reader, config reader, waits, and helpers

src/test/java/tests
Contains TestNG test classes

pom.xml
Manages all Maven dependencies and plugins

.gitignore
Defines files and folders excluded from Git



Framework Architecture

This framework follows a Hybrid Automation approach using:

Page Object Model for UI separation
TestNG for test execution and grouping
Maven for build and dependency management
Utility driven architecture for reusability
ExtentReports for result visualization

How to Run the Tests

Clone the repository

git clone https://github.com/sanjay-64/OrangeHRM.git

Navigate to the project directory

cd OrangeHRM

Execute the tests

mvn clean test


\### 1. Clone the repository

```bash

git clone https://github.com/sanjay-64/OrangeHRM.git

cd OrangeHRM



mvn clean test



Key Features

Page Object Model implementation
Parallel execution support using TestNG
Excel driven testing using Apache POI
Centralized WebDriver management using BaseTest
Automatic browser driver handling using WebDriverManager
HTML reporting using ExtentReports
Logging using Log4j2
Reusable utilities for wait, config and data handling



Recommended IDE

Eclipse
VS Code

Both support Java, Maven, TestNG and Git integration.

Notes

Java 17 and Maven must be installed and added to the system PATH
Latest Chrome browser is supported
WebDriverManager automatically downloads the required browser drivers

Author
Sanjay Kumar


