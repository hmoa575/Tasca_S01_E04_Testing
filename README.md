# Tasca S1.04 – Testing with JUnit 5 and AssertJ

Git clone from https://github.com/hmoa575/Tasca_S01_E04_Testing

**Description**:  
This project contains a set of exercises to practise unit testing in Java using **JUnit 5** and **AssertJ**. It covers essential testing techniques such as parameterized tests, exception handling, and fluent assertions for collections, optionals, and maps. The goal is to write clean, maintainable tests that verify the correctness of Java code.

## Project Structure
└───Tasca_S01_E04_Testing
    └───src
        ├───main
        │   └───java
        │       ├───level01
        │       │   ├───controlexception
        │       │   ├───DniCalculator
        │       │   └───library
        │       └───level02
        └───test
            └───java
                ├───level01
                │   ├───controlexceptionTest
                │   ├───DniCalculatorTest
                │   └───libraryTest
                └───level02

  ## Compilation and Execution from the Command Line

### 1. Compile all source and test files

```bash
javac -d out -cp "lib/*" src/main/java/**/*.java src/test/java/**/*.java

2. Run tests (Maven)

mvn clean test


Level 1 - Junit
mvn -Dtest=LibraryTest test
mvn -Dtest=DniCalculatorTest test

Level 2 - AssertJ

mvn -Dtest=IntegerAssertionTest test
mvn -Dtest=ReferenceAssertionTest test
mvn -Dtest=ArrayAssertionTest test
mvn -Dtest=ListOrderAssertionTest test
mvn -Dtest=MapAssertionTest test
mvn -Dtest=OptionalAssertionTest test
mvn -Dtest=ArrayAccessorTest test

Notes
All tests are written in English.
The code follows good practices: defensive copying, proper exception handling, and clear naming.
AssertJ provides fluent, readable assertions that improve test maintainability.

