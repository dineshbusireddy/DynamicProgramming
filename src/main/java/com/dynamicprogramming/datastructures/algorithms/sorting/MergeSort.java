package com.dynamicprogramming.datastructures.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] inputArr = new int[]{25, 5, 2, 8, 12, 7, 16, 9, 8};
        System.out.println("Before Sort: " + Arrays.toString(inputArr));
        sort(inputArr);
        System.out.println("After Sort: " + Arrays.toString(inputArr));
    }

    public static void sort(int[] inputArr) {
        mergeSort(inputArr, 0, inputArr.length);
    }

    private static void mergeSort(int[] inputArr, int start, int end) {
        if (start >= end || (end-start) == 1) {// start == middle
            return;
        }
        int middle = (int)Math.floor((start+end)/2);
        mergeSort(inputArr, start, middle);
        mergeSort(inputArr, middle, end);
        merge(inputArr, start, middle, end);

    }

    private static void merge(int[] inputArr, int start, int middle, int end) {
        int[] leftArr = new int[middle-start];
        int[] rightArr = new int[end-middle];
        for (int i = start,j=0; i < middle; i++, j++) {
            leftArr[j] = inputArr[i];
        }
        for (int i = middle,j=0; i < end; i++, j++) {
            rightArr[j] = inputArr[i];
        }

        int i = 0;
        int j = 0;
        for (int k = start; k < end; k++) {
            if (i < leftArr.length && j < rightArr.length) {
                if (leftArr[i] < rightArr[j]) {
                    inputArr[k] = leftArr[i];
                    i++;
                } else {
                    inputArr[k] = rightArr[j];
                    j++;
                }
            } else if (i < leftArr.length) {
                inputArr[k] = leftArr[i];
                i++;
            } else {
                inputArr[k] = rightArr[j];
                j++;
            }
        }
    }
}
