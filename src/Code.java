/*
File : Code.java - code for CS 113 Lewis Lecture 2 to supplement Notes.java
Author : Lauren Ruff
Date : 3.23.2020
 */

//packages being imported
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Code extends AbstractClass {

    public static void main(String[] args) {

        //region ArrayList and methods example
        List<String> names = new ArrayList<>();

        //adding element to end of list
        names.add("Lauren");
        names.add("Paul");
        names.add("James");
        //adding element at a specific index in a list - moves other item back
        names.add(1, "Allison");
        //removing an element at a specified index from a list
        names.remove(2);
        //removing a specific element from the list
        names.remove("Allison");
        //replacing an index with something else
        names.set(1, "Johnny Depp");
        //when accessing an item in an arraylist you must use the .get function. cannot use brackets and index
        System.out.println(names.get(1));
        //search an arraylist using the indexOf function, will return an index or -1 if the object is not found
        System.out.println(names.indexOf(8));
        //endregion ArrayList and methods example

        //region Exception examples with try-catch block
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("enter something that is not an int to be added to an array");
            int notInt = input.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Input Mismatch Exception thrown");
        }
        //endregion Exception examples with try-catch block
    }

    //region Using an abstract class
    //if this is removed there is an error
    public void makeNoise(){
        System.out.println("MOOO");
    }
    //endregion using an abstract class
}

//example of an abstract class
abstract class AbstractClass{
    abstract void makeNoise();
    public int returnNum(){
        return 1;
    }
}