package com.dynamicprogramming.string_to_integer;

public class StringToInteger {

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
                    || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                result = sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                break;
            }
            result = result * 10 + digit;
            ++index;
        }


        return sign * result;
    }

}
