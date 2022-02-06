package com.programming.practice.leetcode;

import com.programming.practice.domain.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode currentNode = result;
        int sum = 0;
        boolean firstIteration = true;
        while (l1 != null || l2 != null || sum > 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (firstIteration) {
                currentNode.val = sum % 10;
                firstIteration = false;
            } else {
                currentNode.next = new ListNode(sum % 10);
                currentNode = currentNode.next;
            }
            sum = sum > 9 ? 1 : 0;
        }
        return result;
    }
}

