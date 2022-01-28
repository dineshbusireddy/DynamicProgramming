package com.dynamicprogramming.integer_to_roman;

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


    public static void main(String[] args) {
        IntegerToRoman solution = new IntegerToRoman();
        System.out.println(solution.intToRoman(1));//I
        System.out.println(solution.intToRoman(2));//II
        System.out.println(solution.intToRoman(3));//III
        System.out.println(solution.intToRoman(4));//IV
        System.out.println(solution.intToRoman(5));//V
        System.out.println(solution.intToRoman(6));//VI
        System.out.println(solution.intToRoman(9));//IX
        System.out.println(solution.intToRoman(10));//X
        System.out.println(solution.intToRoman(25));//XXV
        System.out.println(solution.intToRoman(30));//XXX
        System.out.println(solution.intToRoman(40));//XL
        System.out.println(solution.intToRoman(45));//XLV
        System.out.println(solution.intToRoman(50));//L
        System.out.println(solution.intToRoman(58));//LVIII
        System.out.println(solution.intToRoman(70));//LXX
        System.out.println(solution.intToRoman(90));//XC
        System.out.println(solution.intToRoman(97));//XCVII
        System.out.println(solution.intToRoman(100));//C
        System.out.println(solution.intToRoman(325));//CCCXXV
        System.out.println(solution.intToRoman(400));//CD
        System.out.println(solution.intToRoman(490));//CDXC
        System.out.println(solution.intToRoman(500));//D
        System.out.println(solution.intToRoman(590));//DXC
        System.out.println(solution.intToRoman(750));//DCCL
        System.out.println(solution.intToRoman(900));//CM
        System.out.println(solution.intToRoman(950));//CML
        System.out.println(solution.intToRoman(1000));//M
        System.out.println(solution.intToRoman(1025));//MXXV
        System.out.println(solution.intToRoman(1994));//MCMXCIV
        System.out.println(solution.intToRoman(2525));//MMDXXV
        System.out.println(solution.intToRoman(3999));//MMMCMXCIX
        System.out.println(solution.intToRoman(10525));//MMMMMMMMMMDXXV
    }

}
