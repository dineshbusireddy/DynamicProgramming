package com.dynamicprogramming.datastructures.algorithms.basic.datastructures;

public class Queue<T> {
    private static final int MAX_SIZE = 9;
    private int head = -1;
    private int tail = -1;
    private Object[] elementData;

    public Queue() {
        this.elementData = new Object[MAX_SIZE];
    }

    public Queue(int maxCapacity) {
        this.elementData = new Object[maxCapacity];
    }

    public void enqueue(T input) {
        if (head == -1) {
            ++head;
        }

    }
}
