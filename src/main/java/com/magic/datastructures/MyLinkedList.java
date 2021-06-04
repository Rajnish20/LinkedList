package com.magic.datastructures;

public class MyLinkedList<E> {
    public MyNode<E> head = null;
    private MyNode<E> tail = null;

    public void add(E data) {
        MyNode<E> myNode = new MyNode<>(data);

        if (tail == null) {
            this.tail = myNode;
        }
        if (head != null) {
            myNode.next = this.head;
        }
        this.head = myNode;
    }

    public void append(E data) {
        MyNode<E> myNode = new MyNode<>(data);
        if (head == null) {
            this.head = myNode;
        }
        if (tail != null) {
            tail.next = myNode;
        }
        this.tail = myNode;
    }

    public void insert(E data1, E data) {
        MyNode<E> myNode = new MyNode<>(data);
        MyNode<E> temp = head;
        while (temp.data != data1 && temp.next != null) {
            temp = temp.next;
        }
        if (temp.next != null) {
            myNode.next = temp.next;
            temp.next = myNode;
        } else
            System.out.println(data1 + " is not present ");
    }

    public void deleteFirstElement() {
        if (head == null)
            System.out.println("LinkedList is Already Empty");
        else {
            head = head.next;
        }
    }

    public void printLinkedList() {
        MyNode<E> tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
    }

}
