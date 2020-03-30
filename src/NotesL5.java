/*
File : NotesL5.java - Notes for CS 113 Lewis Lecture 5
Author : Lauren Ruff
Date : 03.28.2020

Covered Topics : Stacks, Postfix and Infix Notation, Queues
 */
public class NotesL5 {

    //region Stacks
    /*
     - Stacks are one of the most commonly used data structures in CS
    - What is a Stack?
        ~ LIFO : last in first out
            = items are added to the top
            = items are also accessed from the top
            = only one item can be accessed at a time; it is the only visible one
    - Stack methods:
        ~ boolean empty() : returns if the stack is empty
        ~ E peek() : returns object at the top of the stack, does not remove it
        ~ E pop() : returns the object at the top of the stack, removes it
            = attempting to pop an empty stack throws a EmptyStackException
        ~ void push(E obj) : pushes an item onto the stack and returns the item that was pushed
    - Implementing a Stack using a Vector
        ~ bad idea because vectors allow all elements to be accessible, which goes against the principle of a Stack
    - Implementing a Stack using an Array
        ~
    - * see stack implementation in L5CodeStack.java
     */
    //endregion Stacks

    //region Postfix and Infix Notation
    /*
    - Infix Notation
        ~ How we are used to writing equations
        ~ When the operand goes between the two parts of the equation that are using that operand
        ~ i.e. four times 7 plus 31 = 4*(7+31)
    - Postfix Notation
        ~ easier for a computer to understand because there are no parenthesis or operator precedence
    - Examples : Infix = Postfix
        ~ [4 * 7] = [4 7 *]
        ~ [4 * (7 + 2)] = [4 7 2 + *]
        ~ [(4 * 7) - 20 = [4 7 * 20 -]
        ~ [3 + ((4 * 7) / 2)] = [3 4 7 * 2 / +]
     */
    //endregion Postfix and Infix Notation

    //region Queues
    /*
    - What is a Queue?
        ~ FIFO : First In First Out
            = items are added to the back
            = items are taken from the front
        ~ operating systems uses queues to keep track of tasks
        ~ implements the collection interface
        ~
    - Queue methods:
        ~ boolean offer() : inserts item at rear of queue, returns boolean if successful
        ~ E remove() : removes entry from front of queue and returns it if the queue is not empty, if empty throws NoSuchElementException
        ~ E poll() : removes entry at front of queue and returns it; if empty returns null
        ~ E peek() : returns entry at front of queue without removing ite, if empty returns null
        ~ E element() : returns entry at front of Queue without removing if, if empty throws NoSuchElementException
    - Can use three versions of implementation:
        ~ single-Linked List using Queue<E> newQueue - new LinkedList<E>();
            = stores two references : one for the data, one for the link
        ~ Double-linked list
            = requires 1.5 times the amount of storage of a single-linked list
            = stores three references : one for the data, one for each of the two links
        ~ circularly-linked list
            = when filled to capacity requires half the amount of storage of a single-linked list, but once space is reallocated it requires
                the same amount of storage
    - * see queue implementation in L5CodeQueue.java
     */
    //endregion Queues
}
