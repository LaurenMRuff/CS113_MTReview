/*
File : L4CodeIterator.java - Iterator and ListIterator implementation code for CS 113 Lewis Lecture 4 to supplement NotesL4.java
Author : Lauren Ruff
Date : 3.27.2020
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class L4CodeIterator {

    List<Integer> myList = new LinkedList<>();

    public void addToList(){
        for(int i = 0; i < 10; i++){
            myList.add(i);
        }
    }

    //region Iterator
    public void printList(){
        Iterator<Integer> iter = myList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
            iter.remove();
        }
    }
    //endregion Iterator

    //region ListIterator

    //endregion ListIterator

}
