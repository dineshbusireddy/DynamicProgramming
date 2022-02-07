package com.domain;

import java.util.StringJoiner;

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

    public static ListNode of(int... values) {
        ListNode listNode = null;
        if (values != null) {
            listNode = new ListNode(values[0]);
            ListNode current = listNode;
            for (int i = 1; i < values.length; i++) {
                current.next = new ListNode(values[i]);
                current = current.next;
            }
        }
        return listNode;
    }

    public static String getAsString(ListNode output) {
        StringJoiner result = new StringJoiner(", ", "[", "]");
        ListNode current = output;
        while (current != null) {
            result.add(current.val + "");
            current = current.next;
        }
        return result.toString();
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
