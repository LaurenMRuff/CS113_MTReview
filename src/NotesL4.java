/*
File : NotesL4.java - notes for CS 113 Lewis Lecture 4
Author : Lauren Ruff
Date : 3.27.2020

Covered Topics : Iterator, ListIterator, Enhanced for Statement, Iterable Interface, Implementation of Double-Linked List, Static vs Nonstatic Inner Classes,
                    Vector (ArrayList) vs Linked List, Circular Linked List, Testing, Stacks Introduction
 */
public class NotesL4 {

    //region Iterator
    /*
    - what is an iterator?
        ~ a place marker that keeps the place of the current position in the linked list it is initialized for
        ~ traverses a list in O(n) time, whereas the .get() method traverses a list in O(n^2) list
        ~ interface is defined in java.util.interface
    - how is it implemented?
        ~ starts at the list head
        ~ moves only when the next method is called on the iterator
        ~ conceptually an iterator is between elements
    - iterators can be used to remove elements from a list
        ~ using the remove methods returns an item in the list and then remove it
        ~ next method must be called before the remove method
        ~ iterator.remove() is generally O(n), whereas Linkedlist.remove() is generally O(n^2)
    - iterator limitations
        ~ only traverses a list in the forward direction
        ~ does not provide an add method
        ~ iterator must be advanced to the next spot manually using a loop
    - Pros of Iterator
        ~ few methods to implement
        ~ can iterate over more general data structures
        ~ only required by the collection interface
     */
    //endregion Iterator

    //region ListIterator
    /*
    - ListIterator extends Iterator to overcome the limitations of the Iterator interface
    - about the ListIterator interface
        ~ the position of the iterator is an index from 0 to size
        ~ must implement all Iterator and ListIterator methods
        ~ required by the List interface
    - ListIterator and index
        ~ the listIterator(int index) method starts at the beginning and walks down the list to the desired index, then returns that index, is generally O(n)
     */
    //endregion ListIterator

    //region Enhanced for Statement
    /*
    - creates an Iterator object and implicitly calls its hasNext and Next methods
        ~ all other methods are not available
    - can be used with lists and arrays
     */
    //endregion Enhanced for Statement

    //region Iterable Interface
    /*
    - classes that implement the List interface (a subinterface of the Collection interface)must provide an iterator method
    - the Collection interface extends the Iterable interface
     */
    //endregion Iterable Interface

    //region Implementation of Double-Linked List
    /*
    - * see L4CodeDoubleLinkedList.java
     */
    //endregion Implementation of Double-Linked List

    //region Static vs Nonstatic Inner Classes
    /*
    - static inner classes : no need to access data field of parent class
    - inner classes cannot be declared static if it accesses or modifies data fields of the parent class
        ~ contains an implicit reference to the parent object
     */
    //endregion Static vs Nonstatic Inner Classes

    //region Vector (ArrayList) vs Linked List
    /*
    - https://youtu.be/YQs6IC-vgmo
     */
    //endregion Vector (ArrayList) vs Linked List

    //region Circular Linked List
    /*
    - Circular double-linked list
        ~ first node links to the last node and last node links to the first node
    - Circular single-linked list
        ~ last node links to the first node
        ~ can traverse in the forward direction only
    - advantages of Circular linked lists
        ~ traversing can continue after passing the first or last node
        ~ all elements can be visited no matter where the starting point is
        ~ traversing never causes you to "fall off" the end of the list
    - disadvantages of a circular linked list
        ~ code must avoid an infinite loop
     */
    //endregion Circular Linked List

    //region Testing
    /*
    - What is testing?
        ~ runs section of code under predetermined controlled conditions
        ~ used to detects program defects after compile time
        ~ limited - cannot test for all defects in huge programs; satisfying every possibly outcome would be exhaustive
    - Testing levels
        ~ Unit Testing : tests the smallest testable piece of the software, often a class or complex method
        ~ Integration Testing : tests if different units work together
        ~ System Testing : tests the whole program in a usage context
        ~ Acceptance Testing : tests designed to show that a program meets functional requirements
    - Types of testing
        ~ Block-box testing (AKA closed-box / functional testing)
            = tests items based on interfaces and functional requirements
            = accomplished by varying input parameters across and outside a range, comparing with independently calculates results
            = test data should check for expected and unexpected inputs
        ~ White-box testing (AKA glass-box / open-box / coverage testing)
            = tests items based on knowledge of their internal structure
            = exercises as many possible paths through the element at possible
            = privates appropriate coverage:
                i. statement : ensures each statement is executed at least once
                ii. branch - ensures each choice in a branching mechanism is executed at least once
                iii. path - tests each possible path through a method
            = test data should check that all path combinations are executed
    - Testing Prep
        ~ testing plans should be developed early
        ~ aspects of a test plan : how, when, who will do it, and what test data will be used
    - Tips
        ~ follow javadoc conventions and carefully document method operation, parameters, and class attributes
        ~ leave a trace of execution - kind of like a trail of crumbs to show what part of the code is running
        ~ display parameter values when entering a method, and values of any attributes throughout the method
        ~ display method outputs after returning from a method
    - stubs
        ~ placeholders for methods that have not been implemented yet
        ~ they can
            = print input values
            = assign predictable values to outputs
            = change the state of a variable
    - Preconditions and Postconditions
        ~ both serve as a contract between the method caller and programmer
        ~ preconditions : a statement of any assumptions or constraints on input parameters before the method begins execution
        ~ postcondition : describes the result of executing the method, including changes to the object's state
      */
    //endregion Testing

    //region Stacks Introduction
    /*
    - * see NotesL5.java
    - Stacks are one of the most commonly used data structures in CS
    - What is a Stack?
        ~ LIFO : last in first out
            = items are added to the top
            = items are also accessed from the time
            = only one item cna be accessed at a time; it is the only visible one
    - Stack methods:
        ~ empty() : returns if the stack is empty
        ~ peek() : returns object at the top of the stack, does not remove it
        ~ pop() : returns the object at the top of the stack, removes it
            = attempting to pop an empty stack throws a EmptyStackException
        ~ push(E obj) : pushes an item onto the stack and returns the item that was pushed
    - * see stack application in L4CodeStack.java
     */
    //endregion Stacks Introduction
}
