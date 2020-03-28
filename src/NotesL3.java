/*
File : NotesL3.java - notes for CS 113 Lewis Lecture 3
Author : Lauren Ruff
Date : 3.26.2020

Covered Topics : array review and list interface, generic collections, application of ArrayList class, Vector Class, Algorithm Efficiency and Big-O, Looking Deeper at reallocate(),
                    Single-Linked Lists, Double-Linked Lists and Circular Lists
 */
public class NotesL3 {
    //region Array Review and List interface
        /*
         - array review
             ~ indexed structure where elements can be accessed in any order using the subscript values or with a loop
             ~ cannot change the length of an array, cannot add an element to a specific position without shifting other elements,
                 cannot remove an element without actively shifting other elements
             ~ take up less memory than other options
         - List interface
            ~ provides the functionality of an indexed data structure except with more operations
            ~ stores wrapper class object (Integer, Double, Character, etc.)
         */
    //endregion Array Review and List interface

    //region Generic Collections
    /*
    - Example Statement : List<E> myList = new ArrayList<E>();
        ~ this is a general declaration for a generic collection
        ~ <E> is called the type parameter, sets the data type of all the objects stored in that List
    - Example Statement 2 : List<Integer> myList2 = new ArrayList<Integer>();
        ~ can add objects using anonymous variables: myList2.add(new Integer(3));
            = variables that are not associated with a variable declaration
        ~  can add primitive types using autoboxing : myList2.add(3);
            = boxing or autoboxing will typecast a primative type to its equivalent wrapper class object
    - why use generic collections?
        ~ they are better at type-checking: will catch more errors earlier
        ~ avoids the need to downcast
        ~ can be useful depending on the intent of the program
    */
    //endregion Generic Collections

    //region Application of ArrayList Class
    /*
    - can create an arraylist of objects *see Lecture2Code.java
    - elements of an arraylist
        ~ capacity : the number of elements that can be held in an ArrayList; the Physical size
        ~ size : the number of indexes occupied by data
    - methods in ArrayList with big-o efficiency
        ~ .add(E) : if size < capacity, insert new item at index size, increment size by one, return true, best case O(1), worst case O(n)
            = if false is returned, there is generally not enough memory
        ~ .add(index, E) : check if there is enough capacity, shift the data using a for loop, add the new element at the specified index, O(n)
        ~ .get(index) : returns element at index, O(1)
        ~ .set(index, E) : set the current element at that index equal to a temporary variable, set that index equal to the new data, return the temporary variable, O(1)
        ~ .remove(index) : set a temp variable equal to the data at that index, use a for loop to shift the data, return the temp variable O(n)
        ~ .reallocate() : doubles the capacity, and copies the current data set and new capacity to a new array
     */
    //endregion Application of ArrayList Class

    //region Vector Class
    /*
    - similar to ArrayList but is generally less efficient
    - synchronized : multiple threads can access a Vector object without conflict
     */
    //endregion Vector Class

    //region Algorithm Efficiency and Big-O
    /*
    - big-o allows for the comparison of algorithms for efficiency
    - factorial and exponential growth algorithms do have practical uses
        ~ if they are trying to solve a problem, there is an effective practical limit, so cryptography usually uses this type of algorithm to generate keys
            = the longer the key, the longer it would take a computer to crack the key

     */
    //endregion Algorithm Efficiency and Big-O

    //region Looking Deeper at reallocate()
    /*
    - why do we typically double the capacity?
        ~ usually when inserting att end of an ArrayList is O(1), adding when you also have to reallocate is O(n). doubling allows us to minimize the number of times the efficiency is O(n) instead of O(1).
     */
    //endregion Looking Deeper at reallocate()

    //region Single-Linked Lists
    /*
    - add and remove elements at a known location in O(1) time
    - elements are linked to the following element instead of an index value
        ~ each element is a Node that contains data and a link
        ~ "head" reference the first node in the list
    - limitations:
        ~ insertion at front of list is O(1), while insertion in any other position is O(n)
        ~ insertion is convenient only after a referenced node
        ~ removing a node requires reference to a previous node
        ~ can only be traversed from front to back
     */
    //endregion Single-Linked Lists

    //region Double-Linked Lists and Circular Lists
    /*
    - overcomes limitations of a single-linked list by having a reference to the previous node as well as the next node
    - insertion at the very front or very back are O(1), insertion at any other position is O(n)
    - a circular list's tail references the head node, whereas a Double-Liked list tail next = null
     */
    //endregion Double-Linked Lists and Circular Lists
}
