package com.dynamicprogramming.regular_expression_matching;

public class RegularExpressionMatching {

    public boolean isMatch(String input, String pattern) {
        boolean result = true;
        if (input != null && !input.isEmpty()) {
            for (int i = 0; i < input.length(); i++) {

            }
        }
        return result;
    }

    public static void main(String[] args) {
        RegularExpressionMatching solution = new RegularExpressionMatching();
        System.out.println(solution.isMatch("aa", "a"));// false
        System.out.println(solution.isMatch("aa", "a."));// true
        System.out.println(solution.isMatch("aab", "a*"));// true
        System.out.println(solution.isMatch("ab", ".*"));// true
    }
}
