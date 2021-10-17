# 1331 Day 23 - 10/18/21 Lesson Plan

# Announcements:
- Autograders are a courtesy, you need to be testing your code thoroughly based on the requirements in the HW prompt. We reserve the right to change how the assignment is graded as long as we are grading in accordance to the prompt.

---

# Topics: Casting, and Polymorphism (review), Interfaces and the Comparable interface

---
# Casting, and Polymorphism Review
- WorkerTester.java
- PolymorphismDriver.java

# Interfaces
- “An interface is a **class-like** construct for defining common operations for objects.” pg 510
- Collection of abstract methods and constants (+ a little more after Java 8)
- Often the name ends in -able (Iterable, Comparable, Readable)
- Interfaces must be public (this is checked by the compiler)
```java
public interface Bank {
    ...
}
```
- To implement an interface, you must use the `implements` keyword
- A class can implement **multiple interfaces** this is not multiple inheritance
```java
public class Biggy implements Bank, DrugStore, Cleaner {
    ...
}
```
- Interfaces can have constants (all fields are considered public static final)
- Interfaces can be in hierarchies
- Java 8 added the ability to define default method implementations. This is done with marking the method with the `default` keyword
- Java 8 also added the ability to have static methods in an interface.

# `Comparable` interface
- defines a single method
```java
int compareTo(Object o);
```
- from API should return "a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object."

- Remember String’s compareTo?

# Activity
