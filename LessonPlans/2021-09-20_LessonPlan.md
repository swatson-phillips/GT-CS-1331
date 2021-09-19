# 1331 Day 12 - 09/20/21 Lesson Plan

# Announcements:
- Exam Friday!!!
- [Sample Exam Canvas Quiz](https://gatech.instructure.com/courses/204744/quizzes/290129) (not indicative of the material just the format)
- [Canvas quiz to check you HonorLock setup](https://gatech.instructure.com/courses/204744/quizzes/305371)
- [Make sure you are getting your weekly COVID Surveillance Test](https://health.gatech.edu/coronavirus/testing/surveillance)

---
# Topics: Classes and Encapsulation
---
# Classes
## Defining a class & creating objects (9.1-9.3)
- We've been creating classes, but why?
- Classes have attributes (fields) and behavior (methods)
- Creating objects (new keyword) and the memory model
- play-doh example
- The constructor (more on this later) is executed when you create a new object (using the new keyword): `Car car1 = new Car();` or `Car car1 = new Car(2014, “white”, “nissan”, “altima”);`

## instance data (9.5)
- also called fields
- belongs a particular object
- automatically initialized with defaults for the data type:

<img width="330" alt="image" src="https://user-images.githubusercontent.com/49889272/133936694-6380d2ce-87d9-43d2-a64e-a15fb7b8e363.png">
(https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- You should initialize the fields within the class' constructor (this is good practice), we will talk more about constructors in the next lecture.
- You access the fields/instance data by using the dot operator.
-Examples:
`car1.year
car1.hp
car1.mpg`

## instance methods
- instance methods - functions/procedures(behaviors) within a class
- Different than static methods in that they "belong to" an object, each object has their own copy. The CONTEXT is the specific object that the method was called on
- return statement cause the method to immediately return to the calling context.
- variable scope (9.13): just like with static methods
- overloading (6.8) - same as with static methods
- What can you use from what context and how?
- `StaticAndInstanceMethods.java`

## Live coding
- Create the classes
- add some fields
- write a static method
- write an instance method

## **encapsulation**
- enforcing encapsulation w/ visibility modifiers: (public and private) (9.8)

https://www.scientecheasy.com/2020/07/encapsulation-in-java.html/
- getters and setters (9.9)
