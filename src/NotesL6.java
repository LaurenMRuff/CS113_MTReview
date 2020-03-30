/*
File : NotesL6.java - Notes for CS 113 Lewis Lecture 6
Author : Lauren Ruff
Date : 03.29.2020

Covered Topics : Deque "Deck" Interface, Recursion, Activation Frame
 */
public class NotesL6 {

    //region Deque "Deck" Interface
    /*
    - What is the Deque Interface
        ~ a double-ended queue
            = allows for insertion and removal from both ends
        ~ preferable over the legacy Stack class based on Vector
            = elements should only be accessed from the front of the deque
    - Deque implementations
        ~ ArrayDeque
            = uses a resizeable Circular array
            = does not support indexed operations
            = BUT is the recommended implementation because it will probably be faster and it can be used as a stack
        ~ LinkedList
            = supports indexed operations
     - Deque methods:
        ~ boolean offerFirst(E item) : inserts item at front of deque, returns true if successful
        ~ boolean offerLast(E item) : inserts item at back of deque, returns true if successful
        ~ void addFirst(E item) : inserts item at front of deque, throws exception if item could not be inserted
        ~ void addLast(E item) : inserts item at back of deque, throws exception if the item could not be inserted
        ~ E pollFirst() : removes and returns item at front of deque, if empty returns null
        ~ E pollLast() : removes and returns item at back of deque, if empty returns null
        ~ E removeFirst() : removes the entry at the front of deque and returns it if the deque is not empty; if empty returns NoSuchElementException
        ~ E removeLast() : removes the entry at the back of deque and returns it if the deque is not empty; if empty returns NoSuchElementException
        ~ E peekFirst() : returns entry at front of deque without removing it; if empty returns null
        ~ E peekLast() : returns entry at back of deque without removing it; if empty returns null
        ~ E getFirst() : returns entry at front of deque without removing it; if empty throws NoSuchElementException
        ~ E getLast() : returns entry at back of deque without removing it; if empty throws NoSuchElementException
        ~ boolean removeFirstOccurrence(Object item) : removes first occurrence of item in deque; returns true if item was successful removed
        ~ boolean removeLastOccurrence(Object item) : removes last occurrence of item in deque; returns true if item was successful removed
        ~ Iterator<E> iterator() : returns an iterator to the elements of the deque in the proper sequence
        ~ Iterator<E> descendingIterator<() : returns an iterator to the elements of the deque in reverse sequential order
    - Deque methods equivalent to Stack methods
        ~ push(e) = addFirst(e)
        ~ pop() = removeFirst()
        ~ peek() = peekFirst()
        ~ empty() = isEmpty()
     */
    //endregion Deque "Deck" Interface

    //region Recursion
    /*
    - What is Recursion / a Recursive method
        ~ recursion is the process of reducing a problem into one or more simple versions of itself
        ~ a recursive method is a method that calls itself to solve a problem
        ~ can be proved by induction :
            = prove the theorem is true for the base case
            = verify that each recursive case makes progress towards the base case
            = verify that if all the smaller problems are computed correctly, and then the original problem is solved correctly
    - How to solve a Recursive Algorithm
        ~ 1. find the base case : the smallest possible problem to be solved directly; there is always at least one case
        ~ 2. devise a strategy to reduce the problem into smaller and smaller units that works towards the base case
        ~ 3. combine the smalled units to solve the larger problem
    - An Example : Finding the length of a String
        ~ base case : if the string is empty, return length = 0
        ~ recursive case : else return 1 + methodCall(inputString.substring(1));
    - * see coded examples of recursion in L5CodeRecursion.java
    - Recursive vs Iterative
        ~ iterative use a loop condition (usually)
        ~ recursion tests for the base case
        ~ can always write an iterative version of a recursive case, but can't always write a recursive version for an iterative case
        ~ recursive algorithms may be simpler to write, code, debug, and read
    - Efficiency of Recursion
        ~ recursive methods usually run slower than the iterative counterpart
        ~ overhead is larger for a method call and return than it is for a loop
        ~


     */
    //endregion Recursion

    //region Activation Frame
    /*
    - What is an Activation Frame?
        ~ a storage technique / form that java uses to save new information to the run-time stack
        ~ what it contains storage for :
            = method arguments
            = local variables (if any)
            = return address of the instructions that called the method
        ~ when a method is called, java pushes a new activation frame onto the run-time stack
     */
    //endregion Activation Frame
}
