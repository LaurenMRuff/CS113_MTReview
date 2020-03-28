/*
File : L3CodeDoubleLinkedList.java - Double-Linked list implementation code for CS 113 Lewis Lecture 3 to supplement NotesL3.java
Author : Lauren Ruff
Date : 3.27.2020
 */
public class L3CodeDoubleLinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    //addfront
    private void addFront(E newItem){
        head = new Node<E>(newItem, head, tail);
        size++;
    }

    //inserting a node into the list
    private void inserting(Node<E> newItem){
        Node<E> node = newItem;
        Node<E> nextNode = node.next;
        node.next = nextNode;
        node.prev = nextNode.prev;

        nextNode.prev.next = node;
        nextNode.prev = node;
        size++;
    }

    private void removing(Node<E> node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    /**
     * The inner Node class
     * @param <E> generic type parameter
     */
    private static class Node<E>{
        private E data;
        private Node<E> next = null;
        private Node<E> prev= null;

        private Node(E newData){
            data = newData;
        }

        private Node(E newData, Node<E> nodeNext, Node<E> nodePrev){
            data = newData;
            next = nodeNext;
            prev = nodePrev;
        }
    }
}
