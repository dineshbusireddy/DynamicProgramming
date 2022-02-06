package com.programming.practice.leetcode;

public class ReverseInteger {

    public int reverse(int x) {
        int result = 0;
        int MIN = (int) Math.pow(-2, 31);
        int MAX = (int) Math.pow(2, 31) - 1;

        while (x != 0) {
            int currentDigit = x % 10;
            if ((result > MAX / 10 || (result == MAX / 10 && currentDigit >= MAX % 10))
                    || (result < MIN / 10 || (result == MIN / 10 && currentDigit <= MIN % 10))) {
                result = 0;
                break;
            }
            result = currentDigit + result * 10;
            x = x / 10;
        }

        return result;
    }

}
