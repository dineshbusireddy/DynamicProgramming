package com.dynamicprogramming.longestpalindromicsubstring;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        String result = s;
        if (s != null && s.length() > 1) {
            result = "";
            for (int start = 0; start < s.length(); start++) {
                result = checkPalindrome(s, start, start, result);
                result = checkPalindrome(s, start, start + 1, result);
            }
        }

        return result;
    }

    private String checkPalindrome(String s, int left, int right, String result) {
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            if ((right - left + 1) >= result.length()) {
                result = s.substring(left, right + 1);
            }
            --left;
            ++right;
        }
        return result;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        System.out.println(solution.longestPalindrome("babad"));// bab or aba
        System.out.println(solution.longestPalindrome("cbbd"));// bb
        System.out.println(solution.longestPalindrome("a"));// a
        System.out.println(solution.longestPalindrome("aa"));// aa
        System.out.println(solution.longestPalindrome("abcdef"));// any character
    }

}
