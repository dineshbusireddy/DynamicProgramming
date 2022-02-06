package com.programming.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] findTwoSum(int[] nums, int target) {
        int[] output = new int[2];
        Map<Integer, Integer> valueAndIndexes = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int value = target - nums[index];
            if (valueAndIndexes.containsKey(value)) {
                output[0] = valueAndIndexes.get(value);
                output[1] = index;
                break;
            } else {
                valueAndIndexes.put(nums[index], index);
            }
        }
        return output;
    }

    public int[] findTwoSumBruteForce(int[] nums, int target) {
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
