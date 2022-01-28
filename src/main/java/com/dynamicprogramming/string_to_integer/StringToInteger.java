package com.dynamicprogramming.string_to_integer;

public class StringToInteger {

    public static void main(String[] args) {
        StringToInteger solution = new StringToInteger();
        System.out.println(solution.myAtoi("42")); // 42
        System.out.println(solution.myAtoi("      -42")); // -42
        System.out.println(solution.myAtoi("   +42")); // 42
        System.out.println(solution.myAtoi("4193 with words")); // 4193
        System.out.println(solution.myAtoi("abc")); // 0
        System.out.println(solution.myAtoi("-a")); // 0
        System.out.println(solution.myAtoi("abc 123")); // 0
        System.out.println(solution.myAtoi("-91283472332")); // -2147483648
        System.out.println(solution.myAtoi("0032")); // 32
        System.out.println(solution.myAtoi("-2147483647")); // 32

    }

    public int myAtoi(String s) {
        int result = 0;
        int sign = 1;
        int index = 0;
        while (index < s.length() && s.charAt(index) == ' ') {
            ++index;
        }

        if (index < s.length() && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
            if (s.charAt(index) == '-') {
                sign = -1;
            }
            ++index;
        }

        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            if (result > Integer.MAX_VALUE / 10
                    || (result == Integer.MAX_VALUE / 10 && digit >= Integer.MAX_VALUE % 10)) {
                result = sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                break;
            }
            result = result * 10 + digit;
            ++index;
        }


        return sign * result;
    }

}
