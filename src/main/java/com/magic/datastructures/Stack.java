package com.magic.datastructures;

public class Stack<E> {
    MyLinkedList<E> myLinkedList = new MyLinkedList<>();
    public void push(E data)
    {
        myLinkedList.add(data);
    }

    public MyNode<E> peak()
    {
        return myLinkedList.head;
    }
}
