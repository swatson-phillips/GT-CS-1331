# 1331 Day 13 - 09/22/21 Lesson Plan

# Announcements:
- Exam Friday!!!
- PE 4 due Thursday at 11:59pm
- [Sample Exam Canvas Quiz](https://gatech.instructure.com/courses/204744/quizzes/290129) (not indicative of the material just the format)
- [Canvas quiz to check you HonorLock setup](https://gatech.instructure.com/courses/204744/quizzes/305371)
- [Make sure you are getting your weekly COVID Surveillance Test](https://health.gatech.edu/coronavirus/testing/surveillance)

---
# Topics: Encapsulation and Constructors
---

## **encapsulation**
- enforcing encapsulation w/ visibility modifiers: (public and private) (9.8)

![encapsulation capsule](https://www.scientecheasy.com/wp-content/uploads/2018/06/encapsulation-in-java.png)

- https://www.scientecheasy.com/2020/07/encapsulation-in-java.html/
- The private modifier **enforces encapsulation** and means that no outside class can see/access the data or method.
```java
private int someField;
private static final int someStaticConstant;
private int someMethod(){}
private static someStaticMethod(){}
```

![another capsule](https://1.bp.blogspot.com/-wewWgd9nOdQ/XrE8v3a2mRI/AAAAAAAAANQ/bO0BgZp22qMumWdc7YO7eBnXlZx5J2grQCLcBGAsYHQ/s640/encap.JPG)

https://corejavasea.blogspot.com/2020/05/encapsulation.html

![visibility modifiers - ignore the middle](https://3.bp.blogspot.com/-vcAqVl_jk8w/WmG7rn2zlOI/AAAAAAAAAjc/vLfi-1A9y8M6RalsMq1COdFwj9evntJXQCLcBGAs/s1600/private.png)

http://androidappssourcecodes.blogspot.com/2018/01/accesscanbepackage-private-protected.html

- Data:
    - public: ANYONE (any other class or object) that holds a reference to an object can view and set the value of public fields
    - private: can only be viewed and set from within the class


- Methods
    - public: ANYONE (any other class or object) that holds a reference to an object can call the method; we refer to the collection of the public methods as the class interface or API
- private: can only be called from within the class

- getters and setters (9.9)

# Class Design
- At class level, think about how the class will work (in the class)
- At program level, think about how the objects will interact
- The class should provide a public interface for other classes to interact with in order to uphold the principle of encapsulation.
- “Encapsulation is the packing of data and functions operating on that data into a single component and restricting the access to some of the object’s components. Encapsulation means that the internal representation of an object is generally hidden from view outside of the object’s definition.” https://medium.com/@manjuladube/encapsulation-abstraction-35999b0a3911
- What is NEEDED by other classes vs what is in the class

# Constructors and scope-
- Constructor - special method that is automatically called when objects are instantiated, we will talk more on constructors soon)
- Constructors can:
    - Take in parameters
    - have access modifiers (why? Math class)
    - not have a return datatypes
    - must have the same name as the class (case sensitive)
- Recall scope is region of the program where it is accessible; this is different than visibility from outside of the class
    - Formal params -> only within the method
    - Local variables -> only within the method
    - Instance data -> entire class
- Field shadowing:
>"A **parameter** can have the **same name** as one of the **class's fields**. If this is the case, the parameter is said to shadow the field. Shadowing fields can make your code difficult to read and is conventionally used only within constructors and methods that set a particular field.” https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html

- Be very careful if the parameter name matches an instance variable. 
- ***Default constructor*** - if you don’t write one, one is available as a default that has no parameters
