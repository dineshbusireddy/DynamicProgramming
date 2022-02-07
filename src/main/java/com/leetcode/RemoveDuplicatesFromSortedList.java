package com.leetcode;

import com.domain.ListNode;

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        if (head != null && head.next != null) {
            ListNode current = head;
            ListNode next = current.next;
            while (next != null) {
                if (current.val == next.val) {
                    current.next = next.next;
                } else {
                    current = current.next;
                }

                next = current != null ? current.next: null;
            }
        }

        return head;
    }

}
