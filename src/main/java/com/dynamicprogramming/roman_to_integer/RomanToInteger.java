package com.dynamicprogramming.roman_to_integer;

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


    public static void main(String[] args) {
        RomanToInteger solution = new RomanToInteger();
        System.out.println(solution.romanToInt("I"));// 1
        System.out.println(solution.romanToInt("II"));// 2
        System.out.println(solution.romanToInt("III"));// 3
        System.out.println(solution.romanToInt("IV"));// 4
        System.out.println(solution.romanToInt("V"));// 5
        System.out.println(solution.romanToInt("VI"));// 6
        System.out.println(solution.romanToInt("IX"));// 9
        System.out.println(solution.romanToInt("X"));// 10
        System.out.println(solution.romanToInt("XXV"));// 25
        System.out.println(solution.romanToInt("XXX"));// 30
        System.out.println(solution.romanToInt("XL"));// 40
        System.out.println(solution.romanToInt("XLV"));// 45
        System.out.println(solution.romanToInt("L"));// 50
        System.out.println(solution.romanToInt("LVIII"));// 58
        System.out.println(solution.romanToInt("LXX"));// 70
        System.out.println(solution.romanToInt("XC"));// 90
        System.out.println(solution.romanToInt("XCVII"));// 97
        System.out.println(solution.romanToInt("C"));// 100
        System.out.println(solution.romanToInt("CCCXXV"));// 325
        System.out.println(solution.romanToInt("CD"));// 400
        System.out.println(solution.romanToInt("CDXC"));// 490
        System.out.println(solution.romanToInt("D"));// 500
        System.out.println(solution.romanToInt("DXC"));// 590
        System.out.println(solution.romanToInt("DCCL"));// 750
        System.out.println(solution.romanToInt("CM"));// 900
        System.out.println(solution.romanToInt("CML"));// 950
        System.out.println(solution.romanToInt("M"));// 1000
        System.out.println(solution.romanToInt("MXXV"));// 1025
        System.out.println(solution.romanToInt("MCMXCIV"));// 1994
        System.out.println(solution.romanToInt("MMDXXV"));// 2525
        System.out.println(solution.romanToInt("MMMCMXCIX"));// 3999
    }

}
