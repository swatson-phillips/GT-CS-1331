# 1331 Day 15 - 09/27/21 Lesson Plan

# Announcements:
- Exam 1 Friday!!! **You must be in person and have your BuzzCard scanned**
- Virtual Office Hours and the new queue, have to be on GT network or VPN to use
- PE 4 due Thursday at 11:59pm
- [Sample Exam Canvas Quiz](https://gatech.instructure.com/courses/204744/quizzes/290129) (not indicative of the material just the format)
- [Canvas quiz to check you HonorLock setup](https://gatech.instructure.com/courses/204744/quizzes/305371)

---

# Topics: Encapsulation and Constructors

---
# encapsulation
## Review:
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

- See the diagram in [Canvas](https://gatech.instructure.com/courses/204744/files/24258409?module_item_id=1875154) or in the provided outline

## getters and setters (9.9)
 - we add getter/accessor methods for providing public access to private data
 - we add setter/mutator methods for providing public access to modify private data (and provide safeguards)
 - Write getters and setters for the `Unicorn` and `UnicornFarm`

# Constructor chaining (9.14.2)
- Using the `this` keyword to call another constructor
- Always chain constructors from the least number of parameters to more.
```java
Unicorn() {
    this("Special Unicorn",
        20,
        65.0
        15.0,
        "purple",
        UnicornTrail.RAINBOW);
}
Unicron(String _=name,
        int age,
        double speed,
        double foodConsumptionRate,
        String favColor,
        UnicornTrail myTrail){
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.foodConsumptionRate = foodConsumptionRate;
        this.favColor = favColor;
        this.myTrail = myTrail;
}
```

# Copy Constructors
- Why have copy constructors
- shallow vs deep copy constructors
- What if your class has instance data the references another object?

# Static as a modifier on Variables
- the variable is shared 
- how can you keep up with the number of `Unicorns` have been created in the program?

# `null` and NPE
- `null` is a literal value that representse the absence of a reference value
- this is the daault when a variable that holds an object reference has not been initialize (doesn't point to any object)
- If you try to "deference" a variable that holds a null value, you can end up with a `NullPointerException`
- The `NullPointerException` is a Runtime exception that can cause your program to crash.
- Let's look at an example...
