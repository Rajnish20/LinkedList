package com.magic.datastructures;

public class Stack<E> {
    MyLinkedList<E> myLinkedList = new MyLinkedList<>();

    public void push(E data) {
        myLinkedList.add(data);
    }

    public void pop() {
        myLinkedList.deleteFirstElement();
    }

    public MyNode<E> peak() {
        return myLinkedList.head;
    }

    public void printStack() {
        myLinkedList.printLinkedList();
    }
}
