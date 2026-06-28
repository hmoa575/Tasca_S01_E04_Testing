# Tasca S1.04 - Testing

This project contains the exercises for Sprint 1 - Task S1.04 focused on Java testing with JUnit 5, AssertJ, and TDD.

---

## Overview

The repository is designed to practice the core concepts of automated testing in Java:

- unit testing with JUnit 5
- expressive assertions with AssertJ
- parameterized tests
- exception testing
- separation of business logic from input/output to make code testable

The exercises are organized progressively to build a solid testing foundation using modern Java tools and good development practices.

---

## Technologies

- Java
- Maven
- JUnit 5
- AssertJ

---

## Project Structure

```text
Tasca_S01_E04_Testing
└── src
    ├── main
    │   └── java
    │       ├── level01
    │       │   ├── controlexception
    │       │   ├── dnicalculator
    │       │   └── library
    │       └── level02
    └── test
        └── java
            ├── level01
            │   ├── controlexceptiontest
            │   ├── dnicalculatortest
            │   └── librarytest
            └── level02
```

---

## Exercises

### Level 1 - JUnit

#### Exercise 1 - Library tests
Implementation and unit tests for a class that manages a book collection.

Main features covered:
- add books
- get all books preserving insertion order
- get a book by position
- insert a book at a specific position
- remove a book by title
- return an alphabetically sorted copy of the collection
- prevent duplicated titles

#### Exercise 2 - Parameterized DNI test
Implementation and parameterized tests for a DNI letter calculator.

Main features covered:
- calculate the correct DNI letter from a number
- validate multiple input cases using parameterized tests
- handle invalid values such as negative or out-of-range numbers

#### Exercise 3 - Exception control
Implementation and tests for code that throws `ArrayIndexOutOfBoundsException` under the expected conditions.

---

### Level 2 - AssertJ

This level includes tests that demonstrate fluent assertions with AssertJ.

Covered cases include:
- integer equality and inequality
- object reference equality and difference
- identical integer arrays
- list content and insertion order
- presence or absence of elements in collections
- map key validation
- exception assertions
- empty `Optional` validation

---

## How to Run

### Run all tests

```bash
mvn clean test
```

### Run a specific test class

#### Level 1

```bash
mvn -Dtest=LibraryTest test
mvn -Dtest=DniCalculatorTest test
```

#### Level 2

```bash
mvn -Dtest=IntegerAssertionTest test
mvn -Dtest=ReferenceAssertionTest test
mvn -Dtest=ArrayAssertionTest test
mvn -Dtest=ListOrderAssertionTest test
mvn -Dtest=MapAssertionTest test
mvn -Dtest=OptionalAssertionTest test
mvn -Dtest=ArrayAccessorTest test
```

---

## Notes

- All code and tests are written in English.
- The project uses Maven to manage dependencies and test execution.
- The focus of the repository is testing practice, code quality, and clean structure.
