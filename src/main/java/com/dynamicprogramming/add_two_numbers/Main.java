package com.dynamicprogramming.add_two_numbers;

public class Main {
    public static void main(String[] args) {
        addTwoNumbers();
    }

    private static void addTwoNumbers() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode listNodeOne = new ListNode(2).addLast(4).addLast(3);
        ListNode listNodeTwo = new ListNode(5).addLast(6).addLast(4);
        printOutput(addTwoNumbers.addTwoNumbers(listNodeOne, listNodeTwo));

        listNodeOne = new ListNode(2).addLast(4).addLast(3).addLast(3);
        listNodeTwo = new ListNode(5).addLast(6).addLast(4);
        printOutput(addTwoNumbers.addTwoNumbers(listNodeOne, listNodeTwo));

        listNodeOne = new ListNode(9).addLast(9).addLast(9).addLast(9).
                addLast(9).addLast(9).addLast(9).addLast(9).addLast(9);
        listNodeTwo = new ListNode(9).addLast(9).addLast(9).addLast(9);
        printOutput(addTwoNumbers.addTwoNumbers(listNodeOne, listNodeTwo));

        listNodeOne = new ListNode(0);
        listNodeTwo = new ListNode(0);
        printOutput(addTwoNumbers.addTwoNumbers(listNodeOne, listNodeTwo));
    }

    private static void printOutput(ListNode output) {
        ListNode current = output;
        while (current != null) {
            System.out.print(current.val);
            current = current.next;
        }
        System.out.println();
    }
}
