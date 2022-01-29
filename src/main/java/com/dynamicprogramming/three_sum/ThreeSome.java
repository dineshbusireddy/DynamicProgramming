package com.dynamicprogramming.three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSome {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ThreeSome solution = new ThreeSome();
        System.out.println(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));//[[-1,-1,2],[-1,0,1]]
        System.out.println(solution.threeSum(new int[]{}));//[]
        System.out.println(solution.threeSum(new int[]{0}));//[]
        System.out.println(solution.threeSum(new int[]{-2, 0, 0, 2, 2}));//[[-2,0,2]]
    }

}
