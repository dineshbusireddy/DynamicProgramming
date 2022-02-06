package com.programming.practice.leetcode;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int left = 0;
        if (nums != null && nums.length > 0) {
            left = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] != nums[i]) {
                    nums[left++] = nums[i];
                }
            }
        }
        return left;
    }


    public int removeDuplicates1(int[] nums) {
        int result = 0;
        if (nums != null && nums.length > 0) {
            int left = 0;
            int right = 1;
            while (right < nums.length) {
                if (nums[left] != nums[right]) {
                    nums[++left] = nums[right];
                }
                right++;
            }
            result = left + 1;
        }

        return result;
    }

}
