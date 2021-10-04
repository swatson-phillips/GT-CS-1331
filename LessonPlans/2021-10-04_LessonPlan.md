# 1331 Day 18 - 10/04/21 Lesson Plan

# Announcements:
- Exam 1 regrades due by 10/6/21 [here](https://forms.office.com/Pages/ResponsePage.aspx?id=u5ghSHuuJUuLem1_Mvqgg116w8wwfSRJtFsYJ4T2CRtUOEhDQ1MzV1hHSldWR0g3UFRFVENIQzBPNiQlQCN0PWcu)
- As a reminder, this is coded as an in-person class. I cannot guarantee the same learning experience if you do not come to class.

---

# Topics: Inheritance and Additional Visibility

---

# Inheritance
## Recap
- process of defining/deriving new classes from existing ones. A sub-class automatically contains some or all of the methods and data of the original (parent) class but can also add new ones
- The keyword to indicate that a child class extends (is a child of) a parent is **extends**
- The relationship can be expressed as a “is a” hierarchy; for example, Square is a Shape, *Circle* **is a** *Shape*
- A `Person`, `Student`, and a `Dentist` walk into a restaurant...
- Single vs Multiple inheritance and what Java is (single inheritance)
- Access:
    - A child can access ALL public data/methods of the parent

    - A child cannot access private data/methods of the parent. “A subclass does not inherit the private members of its parent class. However, if the superclass has public or protected methods for accessing its private fields, these can also be used by the subclass.” https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html  

    - A child class can access protected data/methods of the parent, we will come back to what this means.
## Constructors in a hierarchy
- `super` keyword: gives access to the parent’s members (data and methods) (kinda like the “this” keyword but for parents). Commonly used to invoke the parent’s constructor
- implicit constructor chaining: Java will insert a `super()` call (with no parameters) as the very first line in the child constructor. If there is not a no parameter constructor in the parent, there will be a compile time error; with the exception of other explicit chained constructor calls.
- constructor call chain: w7_constructorChaining.ppt


# Additional Visibility
- What is the visibility if we do not put a modifier, rely on the default? Field/method is accessible to members of the class itself and to other classes in the same *package*.
- But what if we want the classes in the package and any of the class's children to be able to access the field/method? There is a `protected` modifier. Slightly less restrictive than the default level of accessibility.
- https://learning.oreilly.com/library/view/learning-java-4th/9781449372477/ch06s04.html


|Modifier 	|Class 	| Package 	|Subclass 	|World|
| --- | --- | --- | --- | --- |
|public 	|Y 	|Y 	|Y 	|Y|
|protected 	|Y 	|Y 	|Y 	|N|
|no modifier 	|Y 	|Y 	|N 	|N|
|private 	|Y 	|N 	|N 	|N|

- https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html

# Overriding and the `Object` class
## Overriding
- Recall the **overloading** is when you have more than 1 method with the same name but different parameter lists.
- Also recall that a child class inherits the public and protected methods from it's parent.
- But what if you want a child class to have different behavior than it's parent?
- This is called ***overriding***. When a child has a method with the same signature as it's parent, it over-writes the parents implementation (i.e. provides a different implementation).
- You can call the parent's implementation explicitly using the `super` keyword
- Static methods can be inherited, but not overridden (simple hides the superclass’ method, this gets into run-time polymorphism which we haven't gotten to yet) https://www.geeksforgeeks.org/can-we-overload-or-override-static-methods-in-java/
- **Overriding instance variables?** ***Don’t do this***, it leads to problems, the child class already has the variable
- `@Overrides` annotation - optional but gives you some added compile time checking to ensure that you are actually overriding and not overloading.

---

stopped here 10/4/21

--- 
## `Object` class
- The `Object` class is the root of the class hierarchy
- https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html
- We've been using some of the inherited `Object` methods all along: `toString()` and `equals(Object obj)`
- But we should be overriding the implementation with our own.
- Override `toString` and `equals` in `Person`, `Student`, `Dentist`
## Overriding `toString()`
- from API:
> Returns a string representation of the object. In general, the `toString` method returns a string that "textually represents" this object.  The result should be a **concise** but informative representation that is easy for a person to read.

## Overriding `equals(Object obj)`
- [5 rules for overriding (your don't need to memorize)]( https://medium.com/codelog/5-rules-for-overriding-equal-method-effective-java-notes-16168981374)
- If everything is an `Object` then **ANYTHING** can be passed in, SO you need to check the type of the object before attempting a cast
- `instanceOf` operator vs `getClass()`
