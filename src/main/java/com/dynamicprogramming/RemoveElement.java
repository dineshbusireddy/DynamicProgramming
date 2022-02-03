package com.dynamicprogramming;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        if (nums != null && nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (val != nums[i]) {
                    nums[result++] = nums[i];
                }
            }
        }

        return result;
    }
}
