package com.programming.practice.datastructures.algorithms.sorting;

import java.util.Arrays;

//Every iteration smaller item will be selected --> O(n2)
public class SelectionSort {
    public static void main(String[] args) {
        int[] inputArr = new int[]{12, 9, 6, 4, 2, 1};
        sort(inputArr);
    }

    public static void sort(int[] inputArr) {
        System.out.println("Before Sort: " + Arrays.toString(inputArr));
        for (int i=0; i<inputArr.length-1;i++) {
            System.out.println("Iteration : " + (i + 1));
            int minIndex = i;
            for (int j=i+1;j<inputArr.length; j++) {
                if (inputArr[minIndex] > inputArr[j]) {
                    minIndex = j;
                }
            }
            if (inputArr[i] != minIndex) {
                int temp = inputArr[i];
                inputArr[i] = inputArr[minIndex];
                inputArr[minIndex] = temp;
            }
            System.out.println(Arrays.toString(inputArr));
        }
        System.out.println("After Sort :" + Arrays.toString(inputArr));

    }
}
