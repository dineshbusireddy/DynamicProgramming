package com.dynamicprogramming.datastructures;

import java.util.StringJoiner;

public class LinkedList {
    private Node head;

    public void addLast(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            head.addLast(value);
        }
    }

    public void addFirst(int value) {
        Node temp = head;
        head = new Node(value);
        head.next = temp;
    }

    public void addLastMultiple(int... inputArray) {
        for (int index = 0; index < inputArray.length; index++) {
            addLast(inputArray[index]);
        }
    }

    public void addFirstMultiple(int... inputArray) {
        for (int index = 0; index < inputArray.length; index++) {
            addFirst(inputArray[index]);
        }
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ", "[", "]");
        Node current = head;
        while (current != null) {
            result.add(current.val+"");
            current = current.next;
        }
        return result.toString();
    }

    public Node getHead() {
        return head;
    }
}
