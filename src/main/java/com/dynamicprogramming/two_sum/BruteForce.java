package com.dynamicprogramming.two_sum;

public class BruteForce implements ITwoSum {
    public int[] findTwoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) {
            int innerIndexResult = -1;
            for (int innerIndex = outerIndex + 1; innerIndex < nums.length; innerIndex++) {
                int sum = nums[outerIndex] + nums[innerIndex];
                if (sum == target) {
                    innerIndexResult = innerIndex;
                    break;
                }
            }
            if (innerIndexResult > -1) {
                output[0] = outerIndex;
                output[1] = innerIndexResult;
            }
        }
        return output;
    }
}
