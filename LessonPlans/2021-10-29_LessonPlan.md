# 1331 Day 28 - 10/29/21 Lesson Plan

# Announcements:
- Regrade requests for Exam 2 are due by 10/29 @11:59pm

---

# Topics: Sorting, Exceptions, File I/O

---

# Sorting
## Selection
(ascending/increasing)
0. initialize the current index to the first element (0)
1. find the smallest element in the list
2. swap the smallest element with the current index
3. increment the current index
4. repeat
- Example:
```java
[50,90,30,22,45,10,100,65]
iteration 1: [10,90,30,22,45,50,100,65]
iteration 2: [10,22,30,90,45,50,100,65]
iteration 3: [10,22,30,90,45,50,100,65] // 30 is smallest
iteration 4: [10,22,30,45,90,50,100,65]
iteration 5: [10,22,30,45,50,90,100,65]
iteration 6: [10,22,30,45,50,65,100,90]
iteration 7: [10,22,30,45,50,65,90,100]
```

## Insertion
(ascending/increasing)
0. the first sub-list contains only the 1st element and the current index is set to be the second element
1. insert the element in the current index, into the correct location
2. increment the current index
3. repeat
```java
[50,90,30,22,45,10,100,65]
iteration 1:[50,90,30,22,45,10,100,65]
iteration 2:[30,50,90,22,45,10,100,65]
iteration 3:[22,30,50,90,45,10,100,65]
iteration 4:[22,30,45,50,90,10,100,65]
iteration 5:[10,22,30,45,50,90,100,65]
iteration 6:[10,22,30,45,50,90,100,65]
iteration 7:[10,22,30,45,50,65,90,100]
```

## Bubble
Repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.

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
