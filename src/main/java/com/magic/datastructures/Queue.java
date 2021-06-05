package com.magic.datastructures;

public class Queue<E> {
    MyLinkedList<E> myLinkedList = new MyLinkedList<>();

    public void enqueue(E data) {
        myLinkedList.append(data);
    }

    public MyNode<E> front()
    {
        return myLinkedList.head;
    }
}
