package com.datastructures.algorithms.sorting;

import java.util.Arrays;

//Every iteration will insert the in right sorted location --> O(n2)
public class InsertionSort {
    public static void main(String[] args) {
        int[] inputArr = new int[]{7, 12, 9, 7, 6,  4, 2, 1};
        sort(inputArr);
    }




    public static void sort(int[] inputArr) {

        for (int i=1; i<inputArr.length; i++) {
            int current = inputArr[i];
            int j = i-1;
            while (j>=0 && current<=inputArr[j]) {
                inputArr[j+1] = inputArr[j];
                j--;
            }

            inputArr[j+1] = current;
        }

        System.out.println("After Sort :" + Arrays.toString(inputArr));
    }



























    public static void sort1(int[] inputArr) {
        System.out.println("Before Sort: " + Arrays.toString(inputArr));
        for (int i=1; i<inputArr.length;i++) {

            System.out.println("Iteration : " + (i));
            int current = inputArr[i];
            int j = i-1;
            while (j >= 0 && inputArr[j] > current) {
                inputArr[j+1] = inputArr[j];
                j = j - 1;
            }
            inputArr[j+1] = current;
            System.out.println(Arrays.toString(inputArr));
        }
        System.out.println("After Sort :" + Arrays.toString(inputArr));

    }
}
