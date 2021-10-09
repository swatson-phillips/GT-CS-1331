# 1331 Day 21 - 10/13/21 Lesson Plan

# Announcements:
- Make sure to bring your BuzzCard tot he exam on Friday!

---

# Topics: Class Hierarchy, Casting, and Polymorphism

---
# Polymorphism
## 10 minute summary
1. Means having many forms.
2. Allows us to deal with the diverse (but related) members of a group in a general way. Polymorphism means that a variable of a supertype can refer to a subtype object.
3. Use the “is-a” test: <object’s class name> always “is-a” <***variable*** type>

Example: `Animal a1 = new Fish();`
`Fish` is-a `Animal`

4. We can assign or substitute a member of a **subclass** for a **parent/super** class but not vice-versa
5. **Dynamic Binding**: binding of which type of object is stored in the variable and influences the method call; is deferred until run-time.
6. Every variable has 2 types at Runtime in Java: static and dynamic. Note that static here is different than the keyword `static`. The **static type** refers to the declared variable type and it is used at compile time to determine what is legal to call. The **dynamic type** is the type of the object stored in the variable which is determined at Runtime.
7. At compile time, Java only looks at the static type (i.e. the declared type of the **variable**) to determine what is legal (what will compile).
8. At Runtime, Java looks at the type of the object stored in the variable to determine what code gets executed *dynamically*.
9. It takes practice to be comfortable predicting what compiles and will run. You need to know this for exam 3.
10. Example: `Object`, `Animal`, `Dog`

# Coding Activity - Books?



# Class Hierarchy and Casting
## 5 minute summary
1. As we've seen hierarchies are everywhere in OOP and Java specifically. We want to keep the common "features" as high up in the hierarchy as possible.
2. Sometimes we will need to cast objects to different type so that we can access object specific behaviors.
3. **Down Cast**: casting a variable from higher in the hierarchy (static type) to a type lower in the hierarchy. Really the only time you NEED to cast. Used when you are holding an object of a type lower in the hierarchy in a variable higher in the hierarchy BUT you want to access methods of the object that are ONLY available in the object lowest in the hierarchy
- Will always compile
- Will **sometimes** result in a `RuntimeException`
4. **Up Cast**: casting an object from lower in the hierarchy to a static type higher in the hierarchy.
- Will always compile
- Will always run
- Not necessary because a child class **is-a** type of it's parent, it can already access all of the behaviors of it's parent
5. **Side Cast**: casting between 2 siblings
- Never compiles
- Never runs


