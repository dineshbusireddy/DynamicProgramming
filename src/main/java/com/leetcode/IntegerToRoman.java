package com.leetcode;

public class IntegerToRoman {

    public String intToRoman(int num) {
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder romanString = new StringBuilder();
        if (num > 0) {
            for (int i = 0; i < numbers.length; i++) {
                int count = num / numbers[i];
                while (count != 0) {
                    romanString.append(romans[i]);
                    --count;
                }
                num = num % numbers[i];
            }
        }
        return romanString.toString();
    }

}
