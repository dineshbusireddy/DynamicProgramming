package com.datastructures.algorithms.basic.datastructures;

public class Stack<T> {
    private static final int MAX_SIZE = 3;
    private int top = -1;
    private Object[] elementData;

    public Stack() {
        this.elementData = new Object[MAX_SIZE];
    }

    public Stack(int maxCapacity) {
        this.elementData = new Object[maxCapacity];
    }

    public void push(T input) {
        if (elementData.length == (top + 1)) {
            Object[] elementDataNew = new Object[elementData.length*2];
            int index = 0;
            for (Object element: elementData) {
                elementDataNew[index] = element;
                index++;
            }
            elementData = elementDataNew;
        }
        this.elementData[++top] = input;
    }

    public T pop() {
        T result = (T)this.elementData[top];
        --top;
        return result;
    }

    public T peek() {
        return (T)this.elementData[top];
    }

    @Override
    public String toString() {
        StringBuilder toStringBuilder = new StringBuilder("[ ");
        int index = 0;
        for (Object element : elementData) {
            if (index == (top + 1)) {
                break;
            }
            if (element != null ) {
                if (index > 0) {
                    toStringBuilder.append(", ");
                }
                toStringBuilder.append(element);
                index++;
            }
        }
        toStringBuilder.append(" ]");
        return toStringBuilder.toString();
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
