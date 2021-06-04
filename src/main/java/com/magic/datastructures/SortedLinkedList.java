package com.magic.datastructures;

public class SortedLinkedList<E extends Comparable<E>> {
    public MyNode<E> head = null;

    public void add(E data) {
        MyNode<E> myNode = new MyNode<>(data);
        MyNode<E> temp;
        if (head == null || head.data.compareTo(myNode.data) > 0) {
            myNode.next = head;
            head = myNode;
        } else {
            temp = head;
            while (temp.next != null && temp.next.data.compareTo(data) < 0)
                temp = temp.next;
            myNode.next = temp.next;
            temp.next = myNode;

        }
    }

    public void print() {
        MyNode<E> tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
    }

    public static void main(String[] args) {
        com.magic.datastructures.SortedLinkedList<Integer> sortedLinkedList = new com.magic.datastructures.SortedLinkedList<>();
        sortedLinkedList.add(3);
        sortedLinkedList.add(4);
        sortedLinkedList.add(9);
        sortedLinkedList.add(5);
        sortedLinkedList.add(2);
        sortedLinkedList.add(8);
        sortedLinkedList.print();
    }
}
