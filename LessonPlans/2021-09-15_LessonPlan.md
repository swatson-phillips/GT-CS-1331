# 1331 Day 10 - 09/15/21 Lesson Plan

# Announcements:
- Sample Exam Canvas Quiz (not indicative of the material just the format)
- Make sure to do your assigned readings from last lecture if you have not
- Expected out of lecture time for this class. You should spend another **2 hrs outside of class FOR EACH lecture hour**.
- [Make sure you are getting your weekly COVID Surveillance Test](https://health.gatech.edu/coronavirus/testing/surveillance)

---
# Topics: Static methods, Ambiguous Invocation, Enums example
---
## Methods examples
- `FindSum.java` -> `MethodExample.java`
- **All parameters are pass by value! (6.5)**
- `Increment.java `
- `TestPassByValue.java`
## Ambiguous Invocation
<pre><code>public static void max(int a, double b){}
public static void max(double a, int b){}
</code></pre>

**Which method is used for this invocation: `max(13, 17)`**

## Enumerations
- Assigned reading: outline and/or Appendix I and examples
- Questions?
- example: `EnumExample.java` and `ClassYear.java`

## Arrays
- What are arrays?
    - data structure that is a fixed-size that holds elements of the same data type
    - **object!!!**
    - a variable of an array type holds an object reference, what are the implications of this?
- Size: getting the length of an array (.length - not a method unlike String.length())
- Java does auto bounds checking (this is different than C)
- declaring an array
- initializing an array
- assigning values to the array elements
- iterating over an array
    - for loop
    - for-each loop
- Arrays are objects, what happens if you pass an array variable as a parameter to a method? Can you change the elements in the array?
- Can you resize an array?
- Command line arguments
-Multidimensional arrays: look at the outline or textbook chapter 8
