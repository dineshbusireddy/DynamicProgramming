package com.dynamicprogramming.two_sum;

import java.util.HashMap;
import java.util.Map;

public class OnePass implements ITwoSum {

    @Override
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
}
