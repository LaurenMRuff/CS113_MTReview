/*
File : L5CodeQueue.java - Queue implementation code for CS 113 Lewis Lecture 5 to supplement NotesL5.java
Author : Lauren Ruff
Date : 3.29.2020
 */

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class L5CodeQueue<E> {
    private List<E> queueList;
    private int front = 0, rear = -1, size = 0, capacity;

    public L5CodeQueue(int intitCap){
        capacity = intitCap;
        queueList = new LinkedList<>();
    }

    //adds items to queue
    public boolean offer(E item){
        if(queueList.size() == capacity){
            reallocate();
        }
        size++;
        rear = (rear + 1) % capacity;
        queueList.add(rear, item);
        return true;
    }

    //returns and removes items from queue, returns null if empty
    public E poll(){
        if(size == 0){
            return null;
        }
        E result = queueList.get(front);
        front = (front+1)%capacity;
        size--;
        return result;
    }

    //returns and removes items from queue, throws NoSuchElementException when empty
    public E remove(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        E result = queueList.get(front);
        front = (front + 1) % capacity;
        size--;
        return result;
    }

    //returns entry at front of queue without removing it, returns null if empty
    public E peek(){
        if(size == 0){
            return null;
        }
        return queueList.get(front);
    }

    //returns entry at front of queue without removing it, throws NoSuchElementException if empty
    public E element(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queueList.get(front);
    }

    public void reallocate(){
        capacity *= 2;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
