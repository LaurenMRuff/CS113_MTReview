/*
File : Lecture3Code.java - ArrayList implementation code for CS 113 Lewis Lecture 3 to supplement NotesL3.java
Author : Lauren Ruff
Date : 3.27.2020
 */

import java.util.Arrays;

public class L3CodeArrayList<E> {

    private static final int INIT_CAP = 10;

    private int capacity, size;
    private E[] data;

    //constructor allocates storage and casts the array object to type E[]
    public L3CodeArrayList(){
        capacity = INIT_CAP;
        data = (E[]) new Object[capacity];
    }

    //first add method
    public boolean add(E newEntry){
        if(size >= capacity){
            reallocate();
        }
        data[size] = newEntry;
        size++;
        return true;
    }

    //second add method
    public boolean add(int index, E newEntry){
        helper(index);

        if(size >= capacity){
            reallocate();
        }

        for(int i = size; i > index; i--){
            data[i] = data[i-1];
        }
        data[index] = newEntry;
        size++;
        return true;
    }

    //set method
    public E set(int index, E newValue){
        helper(index);
        E oldValue = data[index];
        data[index] = newValue;
        return oldValue;
    }

    //get method
    public E get(int index){
        helper(index);
        return data[index];
    }

    //remove method
    public E remove(int index){
        helper(index);
        E returnEntry = data[index];

        for(int j = index+1; j < size; j++){
            data[j-1] = data[j];
        }
        size--;
        return returnEntry;
    }

    //reallocate method
    public void reallocate(){
        capacity *= 2;
        data = Arrays.copyOf(data, capacity);
    }

    //helper method to throw exception
    public void helper(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException(index);
        }
    }

}
