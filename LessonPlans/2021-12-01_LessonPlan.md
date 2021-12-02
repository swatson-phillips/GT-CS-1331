# 1331 Day 40 - 12/01/21 Lesson Plan

# Announcements:
- Thank a teacher program (for TAs too)


>Do you value good teaching?  If so, let your faculty, TAs, advisers, and mentors know that you appreciate their contributions to your learning. Fill out the form at the site below and the Center for Teaching and Learning will send your note to the person you want to thank.

>The time it takes to say "thank you" can be brief, but the impact it has is far greater than you may realize.  Choose someone to thank today!

>[http://thankateacher.gatech.edu](http://thankateacher.gatech.edu)
- CIOS: access through the Canvas left nevigation menu is the best way
- 
![image](https://user-images.githubusercontent.com/49889272/144159092-61c88016-38a0-40f8-9a73-0bfd78b5106c.png)

---

# Topics: Linked List and Set

---

# Linked List
- Implements a List ADT
- Each node keeps up with whatever data it need to hold plus other nodes that it is linked to. If it is singly link then it just keeps up with the next node after it. If it is doubly linked, then it keeps up with the next node AND the node in front of it.
```java
class CandyNode {
     private Color color;
     private String flavor;  
     private Brand brand;
     private int servingSize;
     private CandyNode next;
}
```
- The linked list itself just keeps up with the head (start) and optionally the tail (end) nodes and then operations that can be performed on it. It does NOT keep up with ALL of the elements.
- [Linked List Animation](http://liveexample.pearsoncmg.com/dsanimation/LinkedListeBook.html)

- Lets look at a `TrainLinkedList` example:
    - `ListADT.java`
    - `TrainNode.java`
    - `TrainList.java`
- Let's look at the code for `TrainNode`
- Let's look at the code for `TrainList`:
   - `TrainNode`
   - `TrainNode remove()`
   - `TrainNode remove(TrainNode element)`
- Let's talk through an `add(E element)`. What about `addAfter(E there, E element)`
- Types of Linked List
    - Singly
    - Circular Single
    - Double
    - Circular Double
# Sets
- We already talked about set ADTs. They have no duplication and no positional guarentees 
- Let's implement a set
- Let's start with the `SetADT.java` file in Canvas
- Let's impement an `ArraySet`
    - `boolean add(T element)`
    - `boolean addAll(SetADT<T> anotherSet)`
    - `int size()`
    - `boolean isEmpty()`
    - `boolean remove(T element)`
    - `boolean contains(T element)`
