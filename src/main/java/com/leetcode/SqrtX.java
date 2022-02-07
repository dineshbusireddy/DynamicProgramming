package com.leetcode;

public class SqrtX {
    public int mySqrt(int x) {
        long result = -1;

        if (x < 2) {
            result = x;
        } else {
            long left = 1;
            long right = x / 2;
            while (left <= right) {
                long middle = (left + right) / 2;
                long square = middle * middle;
                if (square == x) {
                    result = middle;
                    break;
                } else if (square < x) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
            if (result == -1) {
                result = left - 1;
            }
        }

        return (int) result;
    }
}
