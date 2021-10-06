# 1331 Day 18 - 10/04/21 Lesson Plan

# Announcements:
- Small modification to format of lectures

---

# Topics: Inheritance, the Object class, and abstract classes

---
# Feedback
- Thank you for providing some really useful feedback!
- Some of your suggestions:
    - More interaction in lectures <<-- okay, let's talk about this
    - Fewer digressions <<-- I will try to not to digress
    moderately agreed on:
    - Less live coding <<-- okay, let's try it!
    - Providing code done in class after class <<-- Already do this, where to find it
    - More practice exams/problems with answers <<-- I can't do this
    - Using slides to illustrate concepts rather than all live coding <<-- maybe??
    - More practice problems <<-- checkpoints?
- Discussion:
    - There isn't enough time for us to create more "practice exam problems" and it really is not what this class is about. There are a LOT of textbook resources available for free even if you didn't buy the textbook. There are also the recitation and PLUS session materials for practice. I just cannot do more than what we've already given. Reminder, this class isn't about memorization, especially after exam 1. Yes, there are things you need to know but more importantly there are concepts you need to understand and know how to implement correctly.
    - Development of (good) slides takes a lot of time. I will work on incorporating more visuals instead of just code and outlines. I've uploaded all the slides from the textbook to a Canvas module, if that's your speed.
    - The biggest take away is that y'all want more interaction but not necessarily in the form of MY live coding.
    - So, here's the plan...
I'm going to try to develop more activities for y'all to do in class. BUT that means there is less time for me to explain concepts, so you have to come in prepared for the lecture each day. If you do not come prepared, you will NOT get all of the information that you need for this class.

# Inheritance
- Final applied to classes (11.15)
- Try to extend the `String` class

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

## Activity:
- Add `toString` and `equals` in `Person`, `Student`, `Dentist`
- Student provided solution
- How should be test this? What do you expect and why?
    - `p1.equals(p2);`
    - `p2.equals(p1);`
    - `p1.equals(student);`
    - `p1.equals(dentist);`
    - `student.equals(p1);`
    - `dentist.equals(p1);`
- HINT: `instanceOf` operator and `getClass()`
- Challenge: why use `getClass()` vs `instanceOf`

## Followup Challenge:
- Write correct `equals` and `toString` methods for the `GrizzlyBear.java` and `CanadianGrizzlyBear.java` classes found in the "#17-18: Inheritance, Protected and Default Visibility Modifiers, and Overriding and the Object class" module in Canvas

---

stopped here 10/6/21

---

# Abstract classes
## 5 minute intro.
1. "Placeholder" class that has some pieces missing that children need to provide.
2. A class that cannot be used to instantiate objects. A concrete class must extend it and implement it's method in order to be able to create objects.
3. Use the `abstract` keyword to denote the class is abstract.
4. Use the `abstract` keyword to denote the methods that are abstract (have no implementation).
5. Use the `extends` keyword to extend the abstract class and provide a concrete implementation.
