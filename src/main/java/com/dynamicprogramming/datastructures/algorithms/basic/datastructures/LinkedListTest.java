package com.dynamicprogramming.datastructures.algorithms.basic.datastructures;

public class LinkedListTest {
    public static void main(String[] args) {
        /*LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addAtFirst(1);
        linkedList.addAtFirst(2);
        linkedList.addAtFirst(3);
        linkedList.addAtFirst(4);
        linkedList.addAtFirst(5);
        linkedList.addAtFirst(6);
        linkedList.addAtFirst(7);
        linkedList.addAtFirst(8);
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        linkedList.deleteFromHead();
        System.out.println(linkedList);
        System.out.println(linkedList.contains(61));*/

        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.addAtFirst(1);
        linkedList.addAtFirst(2);
        linkedList.addAtFirst(3);
        /*linkedList.addAtFirst(4);
        linkedList.addAtFirst(5);
        linkedList.addAtFirst(6);
        linkedList.addAtFirst(7);
        linkedList.addAtFirst(8);*/
        System.out.println(linkedList);
        linkedList.insertionSort();

        System.out.println(linkedList);


    }
}
