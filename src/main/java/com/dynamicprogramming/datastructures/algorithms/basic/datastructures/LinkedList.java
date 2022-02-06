package com.dynamicprogramming.datastructures.algorithms.basic.datastructures;

public class LinkedList<T> {
    private Node<T> head;

    public void addAtFirst(T data) {
        Node<T> node = new Node<T>(data);
        node.next = head;
        this.head = node;
    }

    public void addToSorted(T data) {

        /*Node<T> newNode = new Node<T>(data);
        if (head != null) {
            if (head.data < data) {
                newNode.next = head;
                head = newNode;
            } else {
                Node<T> current = head.next;
                while (current!= null) {
                    if (current.data == d
                }
            }
        } else {
            head = newNode;
        }*/
    }

    public int size() {
        int size = 0;
        Node<T> current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public void deleteFromHead() {
        if (head != null) {
            head = head.next;
        }
    }

    public boolean contains(T data) {
        boolean found = false;
        Node<T> current = this.head;

        while (current != null) {
            if (data.equals(current.data)) {
                found = true;
                break;
            }
            current = current.next;
        }

        return found;
    }
    @Override
    public String toString() {
        StringBuilder toStringBuilder = new StringBuilder("LinkedList{");
        Node<T> current = head;
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

    public class Node<T> implements Comparable<T>{
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "data=" + data;
        }


        public int compareTo(T o) {
            return 0;
        }
    }
}
