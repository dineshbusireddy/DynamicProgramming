package com.programming.practice.datastructures.algorithms.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] inputArr = new int[]{1, 3, 5, 7, 14, 19, 29, 40, 78, 99, 120, 250, 403, 601, 709, 800, 879, 950, 1000};
        search(inputArr, 120);
    }

    public static void search(int[] inputArr, int eleToSearch) {
        //System.out.println("Before Sort: " + Arrays.toString(inputArr));
        int start = 0;
        int end = inputArr.length;
        int current = inputArr.length/2;
        while (inputArr[current] != eleToSearch && start < end && (end -start) > 1) {
            if (inputArr[current] < eleToSearch) {
                start = current;
            }
            if (inputArr[current] > eleToSearch) {
                end = current;
            }
            current = (start+end)/2;
        }
        if (inputArr[current] == eleToSearch) {
            System.out.println("Found at index: " + current);
        } else {
            System.out.println("Not found");
        }


        //System.out.println("After Sort :" + Arrays.toString(inputArr));

    }
}
