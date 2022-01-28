package com.dynamicprogramming.container_with_most_water;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxArea = 0;
        if (height != null && height.length > 0) {
            int left = 0;
            int right = height.length - 1;

            while (left < right) {
                maxArea = Math.max(maxArea, Math.min(height[left],
                        height[right]) * (right - left));
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();
        System.out.println(solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7})); // 49
        System.out.println(solution.maxArea(new int[]{1,1}));// 1
        System.out.println(solution.maxArea(new int[]{2, 7, 3, 2, 5, 9, 8, 9, 9, 9}));//  56
    }
}
