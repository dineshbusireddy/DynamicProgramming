package com.datastructures.algorithms.sorting;

import java.util.Arrays;

//In every iteration bigger data will be bubbled out to right side --> O(n2)
public class BubbleSort {

    public static void main(String[] args) {
        int[] inputArr = new int[]{12, 9, 6, 4, 2, 1};
        sort(inputArr);
    }

    public static void sort(int[] inputArr) {
        System.out.println("Before Sort: " + Arrays.toString(inputArr));
        for (int i=0; i<inputArr.length-1;i++) {
            System.out.println("Iteration : " + (i + 1));
            for (int j=0;j<inputArr.length-1-i; j++) {
                System.out.println(inputArr[j] + " > " +  inputArr[j+1]);
                if (inputArr[j] > inputArr[j+1]) {
                    int temp = inputArr[j];
                    inputArr[j] = inputArr[j+1];
                    inputArr[j+1] = temp;
                }
                System.out.println(Arrays.toString(inputArr));
            }
        }
        System.out.println("After Sort :" + Arrays.toString(inputArr));

    }
}
