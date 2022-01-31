package com.dynamicprogramming.remove_nth_node_from_end_of_list;

import com.dynamicprogramming.add_two_numbers.ListNode;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result = new ListNode(0, head);
        ListNode left = result;
        ListNode right = result;
        while (n >= 0) {
            right = right.next;
            --n;
        }

        while (right != null) {
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return result.next;
    }

}
