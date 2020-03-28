/*
File : L4CodeDoubleLinkedList.java - Double-Linked List implementation code for CS 113 Lewis Lecture 4 to supplement NotesL4.java
Author : Lauren Ruff
Date : 3.27.2020
 */

import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.NoSuchElementException;


public class L4CodeDoubleLinkedList<E> extends AbstractSequentialList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    //region listIterator methods
    public void add(int index, E newItem){
        listIterator(index).add(newItem);
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return new ListIter(index);
    }

    public E get(int index){
        return listIterator(index).next();
    }
    public int size(){
        return size;
    }
    //endregion listIterator methods

    //region methods for Double-Linked List
    public void addFirst(E item) {
        add(0, item);
    }

    public void addLast(E item) {
        add(size, item);
    }

    public E getFirst() {
        return head.data;
    }

    public E getLast() {
        return tail.data;
    }
    //endregion methods for Double-Linked List

    //region Node Inner class for double-linked list
    /**
     * The inner Node class for a double-linked list
     * @param <E> generic type parameter
     */
    private static class Node<E>{
        private E data;
        private Node<E> next = null;
        private Node<E> prev= null;

        private Node(E newData){
            data = newData;
        }
    }
    //endregion Node Inner class for double-linked list

    //region inner class to implement the ListIterator interface
    private class ListIter implements ListIterator<E>{
        private Node<E> nextItem;
        private Node<E> lastItemReturned;
        private int index = 0;

        //constructor
        public ListIter(int i){
            if(i < 0 || i > size){
                throw new IndexOutOfBoundsException(i);
            }

            lastItemReturned = null;

            if(i == size){
                index = size;
                nextItem = null;
            }
            else{
                nextItem = head;
                for(index = 0; index < i; index++){
                    nextItem = nextItem.next;
                }
            }
        }

        //copy constructor
        public ListIter(ListIter other){
            ListIter itr = new ListIter(0);
            itr.index = other.index;
            itr.lastItemReturned = other.lastItemReturned;
            itr.nextItem = other.nextItem;
        }

        public boolean hasNext(){
            return nextItem!= null;
        }

        //advancing the iterator
        public E next(){
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            lastItemReturned = nextItem;
            nextItem = nextItem.next;
            index++;
            return lastItemReturned.data;
        }

        public boolean hasPrevious(){
            return (nextItem == null && size != 0) || nextItem.prev != null;
        }

        public int nextIndex(){
            return index;
        }

        public int previousIndex(){
            return index-1;
        }

        //move the iterator backwards and return the previous item
        public E previous(){
            if(!hasPrevious()){
                throw new NoSuchElementException();
            }

            if(nextItem == null){
                nextItem = tail;
            }
            else{
                nextItem = nextItem.prev;
            }

            lastItemReturned = nextItem;
            index--;
            return lastItemReturned.data;
        }

        public void add(E obj){
            System.out.println("in add inner class");
            //inserting into an empty list
            if(head == null){
                head = new Node<E>(obj);
                tail = head;
            }
            //inserting at the head
            else if(nextItem == head){
                Node<E> newNode = new Node<E>(obj);
                newNode.next = nextItem;
                newNode.prev = newNode;
                head = newNode;
            }
            //inserting at the tail
            else if(nextItem == null){
                Node<E> newNode = new Node<E>(obj);
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            //inserting into the middle
            else{
                Node<E> newNode = new Node<E>(obj);
                newNode.prev = nextItem.prev;
                nextItem.prev.next = newNode;
                newNode.next = nextItem;
                nextItem.prev = newNode;
            }

            size++;
            index++;
            lastItemReturned = null;
        }

        public void remove(){
            if(lastItemReturned == null){
                throw new IllegalStateException();
            }

            lastItemReturned.prev.next = lastItemReturned.next;
            lastItemReturned.next.prev = lastItemReturned.prev;
        }

        public void set(E item){
            Node<E> replace = new Node<E>(item);
            if(lastItemReturned == null){
                throw new IllegalStateException();
            }
            lastItemReturned.data = replace.data;
        }
    }
    //endregion inner class to implement the ListIterator interface
}
