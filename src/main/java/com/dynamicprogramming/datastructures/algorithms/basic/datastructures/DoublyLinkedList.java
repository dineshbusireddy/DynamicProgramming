package com.dynamicprogramming.datastructures.algorithms.basic.datastructures;

public class DoublyLinkedList {
    private Node head;

    public void addAtFirst(int data) {
        Node node = new Node(data);
        if (head != null){
            head.previous = node;
        }
        node.setNext(head);
        head = node;
    }

    public void insertionSort() {
        if (head != null) {
            Node nodeToShift = head;
            while (nodeToShift != null) {
                Node current = nodeToShift;
                nodeToShift = nodeToShift.next;
                while (current.previous != null) {
                    if (current.previous.data > current.data) {

                        Node previous = current.previous;
                        Node next = current.next;

                        if (next != null) {
                            next.previous = previous;
                        }
                        previous.next = next;
                        if (previous.previous != null) {
                            previous.previous.next = current;
                        }

                    }
                    current = current.previous;

                }

            }
        }
    }

    @Override
    public String toString() {
        StringBuilder toStringBuilder = new StringBuilder("DoublyLinkedList{");
        Node current = head;
        while (current != null) {
            if (head != current) {
                toStringBuilder.append(", ");
            }
            toStringBuilder.append(current.data);
            current = current.next;
        }
        toStringBuilder.append("}");
        return toStringBuilder.toString();
    }

    private class Node {
        private int data;
        private Node previous;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "data=" + data;
        }

    }
}
