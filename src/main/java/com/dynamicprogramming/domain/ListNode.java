package com.dynamicprogramming.domain;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode addLast(int value) {
        if (next == null) {
            next = new ListNode(value);
        } else {
            next.addLast(value);
        }
        return this;

    }

}
