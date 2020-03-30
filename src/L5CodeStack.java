/*
File : L4CodeStack.java - Stack implementation to supplement NotesL4.java
Author : Lauren Ruff
Date : 3.28.2020
*/

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class L5CodeStack<E> {

    private List<E> stackList;
    private int stackTop = -1;

    public L5CodeStack(){
        stackList = new ArrayList<>();
    }

    public E push(E obj){
        stackList.add(obj);
        stackTop++;
        return obj;
    }

    public E pop(){
        if(stackList.isEmpty()){
            throw new EmptyStackException();
        }
        return stackList.get(stackTop--);
    }

    public boolean empty(){
        return stackList.size() == 0;
    }

    public E peek(){
        if (empty()){
            throw new EmptyStackException();
        }
        return stackList.get(stackList.size()-1);
    }
}