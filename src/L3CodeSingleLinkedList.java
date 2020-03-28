import java.util.List;

/*
File : L3CodeSingleLinkedList.java - Single-Linked list implementation code for CS 113 Lewis Lecture 3 to supplement NotesL3.java
Author : Lauren Ruff
Date : 3.27.2020
 */
public class L3CodeSingleLinkedList<E>{

    private Node<E> head = null;
    private int size = 0;

    //addFirst method adds an item to the front of the single-linked list
    private void addFirst(E item){
        head = new Node<E>(item, head);
        size++;
    }

    //addAfter method add an item anywhere else in a single-linked list
    private void addAfter(Node<E> node, E item){
        node.next = new Node<E>(item, node.next);
        size++;
    }

    //removeAfter method removes a node from a single-linked list
    private E removeAfter(Node<E> node){
        Node<E> temp = node.next;
        if(temp != null) { //if the node is not the last node in the list
            node.next = temp.next;
            size--;
            return temp.data;
        }
        else{
            return null;
        }
    }

    //removeFirst method removes the head node from a single-linked list
    private E removeFirst(){
        Node<E> temp = head;
        if(head != null){
            head = head.next;
        }
        if(temp != null){
            size--;
            return temp.data;
        }
        else{
            return null;
        }
    }

    //using a StringBuilder to traverse a single-linked list
    public String toString(){
        Node<E> nodeRef = head;
        StringBuilder result = new StringBuilder();
        while(nodeRef != null){
            result.append(nodeRef.data.toString());
            if(nodeRef.next!= null){
                result.append(" ==> ");
            }
            nodeRef = nodeRef.next;
        }

        return result.toString();
    }

    //getNode method required by the list interface
    private Node<E> getNode(int index){
        Node<E> node = head;
        for(int i = 0; i < index && node != null; i++){
            node = node.next;
        }
        return node;
    }

    //get method
    public E get(int index){
        helper(index);
        Node<E> node = getNode(index);
        return node.data;
    }

    //set method
    public E set(int index, E newValue){
        helper(index);
        Node<E> node = getNode(index);
        E result = node.data;
        node.data = newValue;
        return result;
    }

    //add method
    public void add(int index, E item){
        helper(index);
        if(index == 0){
            addFirst(item);
        }
        else{
            Node<E> node = getNode(index-1);
            addAfter(node, item);
        }
    }

    public boolean add(E item){
        add(size, item);
        return true;
    }

    //helper method to throw exception
    public void helper(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException(index);
        }
    }

    /**
     * The inner Node class
     * @param <E> generic type parameter
     */
    private static class Node<E>{
        private E data;
        private Node<E> next;

        private Node(E newData){
            data = newData;
            next = null;
        }

        private Node(E newData, Node<E> nodeRef){
            data = newData;
            next = nodeRef;
        }
    }
}