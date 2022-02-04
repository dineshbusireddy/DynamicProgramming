package com.dynamicprogramming.search_insert_position;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        // This takes O(log n)
        int positionToInsert = -1;
        int left = 0;
        int right = nums.length - 1;
        int middile = (left + right)/2;
        while(left <= right) {
            if (nums[middile] == target) {
                positionToInsert = middile;
                break;
            } else if (nums[middile] > target) {
                right = middile - 1;
            } else {
                left = middile + 1;
            }
            middile = (left + right)/2;
        }

        if (positionToInsert == -1) {
            positionToInsert = left;
        }

        return positionToInsert;
    }

    /*
        // It takes O(n)
        if (nums[nums.length-1] < target) {
            positionToInsert = nums.length;
        } else {
            for (int i=0; i<nums.length; i++) {
                if (nums[i] >= target) {
                    positionToInsert  = i;
                    break;
                }
            }
        }*/
}
