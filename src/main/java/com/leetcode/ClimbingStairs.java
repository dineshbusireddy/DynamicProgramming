package com.leetcode;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int result = 1;
        if (n > 1) {
            int[] resultHolder = new int[n];
            resultHolder[n - 1] = 1;
            resultHolder[n - 2] = 2;
            int index = n - 3;
            while (index >= 0) {
                resultHolder[index] = resultHolder[index + 1] + resultHolder[index + 2];
                --index;
            }

            result = resultHolder[0];
        }

        return result;
    }
}
