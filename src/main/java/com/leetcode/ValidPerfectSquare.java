package com.leetcode;

public class ValidPerfectSquare {
    public boolean isPerfectSquareBruteForce(int num) {
        boolean result = false;
        for(int i=1; i<=num;i++) {
            if (i*i == num) {
                result = true;
                break;
            } else  if (i*i > num) {
                break;
            }
        }

        return result;
    }

    public boolean isPerfectSquare(int num) {
        boolean result = false;
        if (num == 1) {
            result = true;
        } else {
            long left = 1;
            long right = num/2;
            while (left <= right) {
                long middle = left+(right-left)/2;
                long square = middle * middle;
                if (square == num) {
                    result = true;
                    break;
                } else if (square < num) {
                    left = middle + 1;
                } else if (square > num) {
                    right = middle - 1;
                }
            }
        }

        return result;
    }
}
