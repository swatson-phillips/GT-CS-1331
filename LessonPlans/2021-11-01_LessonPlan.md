# 1331 Day 29 - 11/01/21 Lesson Plan

# Announcements:
- Exam 3 on Friday (goes through recursion)
---

# Topics: Exceptions, File I/O, and Recursion

---

# Exceptions
## Basics
- What happens when something goes wrong in our program?
- We've seen this in our code already... what can you name?
- Exceptions are runtime errors. Exception handling enables a program to deal with runtime errors and continue its normal execution.
- Exceptions are actually objects that define unusual or erroneous situations ***thrown*** by a program, and can be ***caught*** and handled.

## Basic Examples
- `Zero.java` What happen when we do nothing
- `ZeroCaught.java` try/catch/finally
## Writing your own
- Exceptions are in a class hierarchy
- They are all children of the Exception class
- There are checked and unchecked exception. Checked exceptions must be caught. Unchecked excerptions are expected to be rare and the compiler doesn't require them to be caught.
- To write your own exception, simply extend an exception class. If you extend a Runtime exception, then it will be an unchecked exception.

## Advanced Examples
- `MyOutOfRangeException.java` - custom exception
- `CreatingExceptions.java` - using custom exceptions
- `Propagation.java` - how exceptions propagate (flow)

## Declaring exceptions
- If your method can throw a checked exception and you do not wrap it in a try catch block, then you must include a throws <insert checked exception name> to the method header.
- Unchecked exceptions (Runtime exceptions) do not have to be caught nor included in a throws clause because they are expected to be rare in occurrence.

# File I/O
# Files
- Files are objects of the `File` class
- Files are not a stream, but an representation of the files and pathnames on your computer!
- In order the read and write from and to a file, you must use a stream.
```java
File myFile = new File(“ex.txt”);
myFile = new File(“c:\\ex.txt”); //weird windows stuff ;-)
```

## Input
- Use `Scanner` and instead of using `System.in` use a `File` object
- checkout the API [Scanner](https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html)

## Output
- There are lots of ways but the easiest is to use a `PrintWriter`
- read the outline posted in the module
```java
PrintWriter outWriter = new PrintWriter(“C:\\data.txt”);
outWriter.printLn(...);
```
- look at API [PrintWriter](https://docs.oracle.com/javase/7/docs/api/java/io/PrintWriter.html)
- lookout for Exceptions, File I/O is very prone to exception and there are a number of operations that throw the, (`IOException`s)

# Recursion
- Definitions
    - Recursive call - One made to the same method as resident
    - When a problem is defined in terms of itself
- Recursion is not the same as “calling yourself”, a new copy or method activation is produced. The new method call gets pushed onto the “stack”
- Rules of Recursion:
    1. You must have a base case that is “trivial”
    2. You must make progress towards the base case
    3. You don’t talk about recursion… JK, you should talk about recursion ;-)

# Coding activity
