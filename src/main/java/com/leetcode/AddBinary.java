package com.leetcode;

public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int firstIndex = a.length() - 1;
        int secondIndex = b.length() - 1;
        while (firstIndex >= 0 || secondIndex >= 0) {
            int firstNumber = firstIndex >= 0 ? a.charAt(firstIndex) - '0' : 0;
            int secondNumber = secondIndex >= 0 ? b.charAt(secondIndex) - '0' : 0;
            int sum = carry + firstNumber + secondNumber;
            result.append(sum % 2);
            carry = sum / 2;
            --firstIndex;
            --secondIndex;
        }
        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }

}
