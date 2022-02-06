package com.leetcode;

import com.domain.ListNode;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode finalResult = new ListNode();
        ListNode result = finalResult;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                result.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                result.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            result = result.next;
        }

        if (list1 != null) {
            result.next = list1;
        } else if (list2 != null) {
            result.next = list2;
        }
        return finalResult.next;
    }
}
