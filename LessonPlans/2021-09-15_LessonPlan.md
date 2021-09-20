# 1331 Day 10 - 09/15/21 Lesson Plan

# Announcements:
- [Sample Exam Canvas Quiz](https://gatech.instructure.com/courses/204744/quizzes/290129) (not indicative of the material just the format)
- [Canvas quiz to check you HonorLock setup](https://gatech.instructure.com/courses/204744/quizzes/305371)
- Make sure to do your assigned readings from last lecture if you have not
- Expected out of lecture time for this class. You should spend another **2 hrs outside of class FOR EACH lecture hour**.
- [Make sure you are getting your weekly COVID Surveillance Test](https://health.gatech.edu/coronavirus/testing/surveillance)

---
# Topics: Static methods, Ambiguous Invocation, Enums example and ARRAYS
---
## Static methods, how can you call them and from where ...
- Example: `MethodExample.java`
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
- start parallel activity if we are doing it.
- Assigned reading: outline and/or Appendix I and examples
- Questions?
- example: `EnumExample.java` and `ClassYear.java`

![image](https://user-images.githubusercontent.com/49889272/133456764-2c1344ff-f7e9-4bc3-ada3-85ef83fddfac.png)

**(Parallel Activity) == true**

## if(Arrays) ==> Not covered 9/15/21
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

## else(Parallel Activity)
- Let's find the highest number of pets any student in the class has owned at 1 time. (pass a sheet of paper around while we talk about Enums)
- Parallel data processing/decomposition, how can we make this better? Let's find the max number of countries any student has lived in? This time each row will have their own piece of paper and once complete the TAs will coordinate the row comparision at the end. Each row is like a thread or process.
- What if one processing "thread" needs something from another?
- Overhead with performing processing in parallel
- Speedup: Speedup(n) = T(1)/T(n)

(407 seconds)/90 => 4.5x speedup

![20210915_092048](https://user-images.githubusercontent.com/49889272/133456293-6c4f8161-c62b-4474-84d6-22bfd761d40a.jpg)

- http://hmf.enseeiht.fr/travaux/CD0001/travaux/optmfn/micp/reports/s13itml/theory.htm
