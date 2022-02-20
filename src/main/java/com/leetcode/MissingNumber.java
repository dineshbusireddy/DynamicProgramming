package com.leetcode;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int actualSum = 0;
        int expectedSum = nums.length;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
            expectedSum += i;
        }

        return expectedSum - actualSum;
    }
}
