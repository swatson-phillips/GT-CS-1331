# 1331 Day 18 - 10/04/21 Lesson Plan

# Announcements:
- Small modification to format of lectures

---

# Topics: Inheritance, the Object class, and abstract classes

---

# `Object` class
## 5 minute summary

1. The `Object` class is the root of the class hierarchy
- https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html
2. We've been using some of the inherited `Object` methods all along: `toString()` and `equals(Object obj)`
3. But we *should* be **overriding** the implementation with our own.
4. Overriding `toString()`
from API:
> Returns a string representation of the object. In general, the `toString` method returns a string that "textually represents" this object.  The result should be a **concise** but informative representation that is easy for a person to read.

5. Overriding `equals(Object obj)`
- [5 rules for overriding (your don't need to memorize)]( https://medium.com/codelog/5-rules-for-overriding-equal-method-effective-java-notes-16168981374)
- If everything is an `Object` then **ANYTHING** can be passed in, SO you need to check the type of the object before attempting a cast
- `instanceOf` operator vs `getClass()`
## Activity:
- Add `toString` and `equals` in `Person`, `Student`, `Dentist`
- How should be test this? What do you expect and why?
    - p1.equals(p2);
    - p2.equals(p1);
    - p1.equals(student);
    - p1.equals(dentist);
    - student.equals(p1);
    - dentist.equals(p1);
## Followup Challenge:
- write correct `equals` and `toString` methods for the `GrizzlyBear.java` and `CanadianGrizzlyBear.java` classes found in the "#17-18: Inheritance, Protected and Default Visibility Modifiers, and Overriding and the Object class" module

# Abstract classes
## 5 minute intro.
1. "Placeholder" class that has some pieces missing that children need to provide. 
2. A class that cannot be used to instantiate objects. A concrete class must extend it and implement it's method in order to be able to create objects.
3. Use the `abstract` keyword to denote the class is abstract.
4. Use the `abstract` keyword to denote the methods that are abstract (have no implementation).
5. Use the `extends` keyword to extend the abstract class and provide a concrete implementation.
