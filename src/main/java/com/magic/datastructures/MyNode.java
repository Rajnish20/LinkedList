package com.magic.datastructures;

public class MyNode<E> {

    public E data;
    public MyNode<E> next;

    public MyNode(E data) {
        this.data = data;
        this.next = null;
    }

    public MyNode<E> getNext() {
        return next;
    }

    public void setNext(MyNode<E> next) {
        this.next = next;
    }
}
