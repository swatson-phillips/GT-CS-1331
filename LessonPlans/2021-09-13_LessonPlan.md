# 1331 Day 9 - 09/13/21 Lesson Plan

## Announcements:
- Expected out of lecture time for this class. You should spend another **2 hrs outside of class FOR EACH lecture hour**.
- [Make sure you are getting your weekly COVID Surveillance Test](https://health.gatech.edu/coronavirus/testing/surveillance)
- Make sure to check the living schedule for updates on topics as we cover material
- You have 1 "get out of jail free card" this semester where the late penalty on a PE or HW can be waived, just fill out the form. This is not an additional extension.

## Topics: Math, Random, static methods, Enums, and Coding Conventions
### Formatted Output
- Specifying Minimum Width and Precision

![image](https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Printf.svg/640px-Printf.svg.png?1631233486532)

https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Printf.svg/640px-Printf.svg.png?1631233486532

- But wait there's more...

![image](https://docs.oracle.com/javase/tutorial/figures/essential/io-spec.gif)

https://docs.oracle.com/javase/tutorial/figures/essential/io-spec.gif

- [Oracle tutorial on format method](https://docs.oracle.com/javase/tutorial/essential/io/formatting.html)
- Left justification:

<img width="974" alt="image" src="https://user-images.githubusercontent.com/49889272/132780801-9f120019-e65c-43b9-a0f4-452cf853b978.png">
- You really need to play with this to get a feel for how to use it.

### Some useful Classes/Packages
#### `java.util.Random`
- A pseudo random number generator.
- Must include at the top of you class file `import java.util.Random;``
- Important to keep in mind what the range of methods in this class are
  - `nextInt();` // all possible int values
  - `nextInt(int bound);` // from 0 to the bound
  - `nextFloat();` // 0.0f (inclusive) to 1.0f (exclusive)
- See examples: `RandomBasics.java` & `RandomEx.java`
#### `java.lang.Math`
- All methods are static (you do not need to create an object to use them)
- trigonometric functions are in radians
- helpful constants: Math.PI and Math.E
- See examples: `BasicMathDemo.java` & `ExponentialDemo.java`
- https://liveexample.pearsoncmg.com/liang/intro12e/html/FormatDemo.html
### Static methods
- You do not need to create an object to use static methods, they "belong to" the class
- But first... why even put code into methods?
- A class can have a main method (optionally) and any number of other methods.
- To use a static method, you put the ClassName.staticMethodName()
-To define a static method we use the following syntax:
`public static returnType methodName(type paramName) {
    //do stuff
}`
- see figure 6.1 from your textbook
- `FindSum.java` -> `MethodExample.java`
- **All parameters are pass by value! (6.5)**
- `Increment.java `
- `TestPassByValue.java`
### Method Scope
- Scope: region where something can be referenced/accessed
- parameters to methods become local variables
- local variable (parameters and declared) only have scope within the method body
### Method Overloading
- What is the method signature?
- Overloading is when 2 methods have the same name but different signatures (i.e. the parameter list is different)

---
Stoped here 9/13/21
---

- Ambiguous Invocation:
<pre><code>public static void max(int a, double b){}
public static void max(double a, int b){}
</code></pre>

Which method is used for this invocation: `max(13, 17)`
### Emumerations
- Assigned reading (before next class): outline and/or Appendix I and examples
- Bring questions to next class
### Checkstyle/Coding Conventions
- Assigned reading: 1.9 and Checkstyle videos
