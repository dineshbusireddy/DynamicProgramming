package com.leetcode;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int currentSum = sum;
        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum += nums[i];
            sum = Math.max(currentSum, sum);
        }

        return sum;
    }
}
