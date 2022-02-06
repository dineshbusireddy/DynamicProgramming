package com.leetcode;

public class RomanToInteger {

    public int romanToInt(String s) {
        int result = 0;
        if (s != null && !s.isEmpty()) {
            int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            for (int i = 0; i < romans.length; i++) {
                int count = 0;
                while (s.startsWith(romans[i])) {
                    s = s.substring(romans[i].length());
                    ++count;
                }
                result += count * numbers[i];

            }
        }

        return result;
    }

}
