package com.leetcode;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexToCopy = m + n - 1;
        if (n > 0) {
            int i = m - 1;
            int j = n - 1;
            while (i >= 0 && j >= 0) {
                if (nums1[i] < nums2[j]) {
                    nums1[indexToCopy] = nums2[j];
                    j--;
                } else {
                    nums1[indexToCopy] = nums1[i];
                    i--;
                }
                --indexToCopy;
            }

            while (i >= 0) {
                nums1[indexToCopy] = nums1[i];
                i--;
                indexToCopy--;
            }

            while (j >= 0) {
                nums1[indexToCopy] = nums2[j];
                j--;
                indexToCopy--;
            }
        }
    }
}
