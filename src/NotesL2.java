/*
File : NotesL2.java - notes for CS 113 Lewis Lecture 2
Author : Lauren Ruff
Date : 3.23.2020

Covered Topics : Github, Parts of a Java Program, Big-O Notation (Asymptotic Complexity), ArrayLists
 */
public class NotesL2 {

    /**Ways to solve a problem*/
        /*1. random : randomly guess until the correct answer is found. Will always work but takes incredibly long run times.
         *2. brute force : can calculate the maximum amount of runs it will take to find the correct answer. Code tends to be bulky and inefficient.
         *3. feedback : uses feedback from the program to be a "smart" program and come to the correct solution based on previous runs. quickest and mose efficient.
         */

    //region Github
        /**Gradle*/
        /*
        - gradle is an open-source build automation tool
        - gradle creates a summary description of your program (project, layout, dependency) and then runs through tasks
         */

        /**JUnit Testing*/
        /*
        - you can write tests that will test individual methods in a program
        - good test sets will run through all possible code paths and hit every line (known as code coverage, or % of code covered by tests)
        */

        /**Continuous Integration*/
        /*
        - integration tools include Travis, Gradle, and ant
            ~ every time a repository is pushed to GitHub a build is attempted using one of those integration tools
         */
    //endregion Github

    //region Parts of a Java Program
        /** Object Oriented Programming (OOP)*/
        /*
        - four main principles of OOP are Aggregation, Polymorphism, Inheritance, and Encapsulation
        - parts of OOP can be concrete or nominal
         */

        /**Abstract Classes*/
        /*
        * see example in Lecture2Code.java
        - provide partial implementation
        - cannot be instantiated
        - all subclasses must define abstract methods
        */

        /**Objects*/
        /*
        - The object Object is the superclass to every other class in Java
            ~ has the methods boolean equals(Object obj), int hashCode(), String toString(), Class<?> getClass()
            ~ any object may be casted to object
        */

        /**Exceptions*/
        /*
        * see example in Lecture2Code.java
        - two categories of exceptions"
            ~ CHECKED : errors that were not created by errors made by the programmer
                = use a try-catch block to throw one if there is a possibility that that code throws an exception
                    i.e. FileNotFoundException
                = Finally blocks will always run even if an error is thrown and not caught
            ~ UNCHECKED : errors that occur as a result of programmer errors or external conditions
                = do not have to be checked
                    i.e NullPointerExceptions, ArrayIndexOutOfBoundsException
         */

        /**Packages*/
        /*
        - help support encapsulation
        - important when dealing with access modifiers
            ~ access modifiers : public, protected, private, default
         */

        /**Unified Modeling Language (UML)*/
        /*
        - set of software diagrams that are used to visually represent software
            ~ class diagram : for each class it includes the access modifier and variables, and each method access modifier, return type,
                method name, parameters types, and the relationships between classes of a program
                = inheritance is shown with a blank triangle
                = composition is shown with a filled black diamond
            ~ sequence diagram : outlines the sequence of a events/flow of information in a program between the user and between objects
         */
    //endregion Parts of a Java Program

    //region Big-O Notation (Asymptotic Complexity)
    /*
    - What is Big-O notation?
        ~ describes the runtime efficiency (worst case scenario of runtime) and can describe the memory requirements of an algorithm
        ~ the asymptotic upper bound (inclusive)
        ~ focuses on orders of magnitude
            = the equation simplifies the piece with the largest runtime, or the piece with the highest exponent
        ~ Formal definition : for all n > n sub 0, c*f(n) = T(n), and c*f(n) is the upper bound on performance. Performance will never be
            worse than this but it can be better
            = Variables:
                T(n) : graph of the exact processing time
                f(n) : function that gets close
                n sub 0 and c : constants that are greater than zero
        ~ Growth rate from lowest (high efficiency) to highest (low efficiency) : O(1) < O(log(n)) < O(n) < O(nlog(n)) < O(n^2) < O(n^3) < O(2n) < O(n!)
            SOME EXAMPLES:
            = O(1) : printing a statement to the console
            = O(log(n)) : binary search
            = O(n) : single loop, linear search
            = O(nlog(n)) : merge sort
            = O(n^2) : nested loops, bubble sort
    - Other types of notation:
        ~ Theta notation : the asymptotic tight bound
        ~ Big-omega notation : the asymptotic lower bound (inclusive)
     */
    //endregion Big-O Notation (Asymptotic Complexity)

    //region ArrayList Class
    /* see example in Lecture2Code.java
    - implements the list interface
        ~ need to import java.util.arraylist and java.util.list
    - useful because any element can be accessed quickly in any order, new elements can be added anywhere in the list, need an array that grows
        ~ default capacity = 10
        ~ default size = 0
     */
    //endregion ArrayList Class
}