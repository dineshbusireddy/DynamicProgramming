package com.dynamicprogramming.datastructures;

public class Node {
    int val;
    Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public void addLast(int value) {
        if (next == null) {
            next = new Node(value);
        } else {
            next.addLast(value);
        }
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
