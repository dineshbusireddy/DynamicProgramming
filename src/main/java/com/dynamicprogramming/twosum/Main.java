package com.dynamicprogramming.twosum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Brute Force Way");
        findTwoSum(new BruteForce());
        System.out.println("One Pass Way");
        findTwoSum(new OnePass());

    }

    private static void findTwoSum(ITwoSum bruteForce) {
        int[] input = {2, 7, 11, 15};
        System.out.println(Arrays.toString(bruteForce.findTwoSum(input, 9)));//[0, 1]
        input = new int[]{3, 2, 4};
        System.out.println(Arrays.toString(bruteForce.findTwoSum(input, 6)));//[1, 2]
        input = new int[]{3, 3};
        System.out.println(Arrays.toString(bruteForce.findTwoSum(input, 6)));//[0, 1]
        input = new int[]{2, 1, 5, 3};
        System.out.println(Arrays.toString(bruteForce.findTwoSum(input, 4)));//[1, 3]
    }


}
