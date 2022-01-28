package com.dynamicprogramming.longest_substring;

public class Main {
    public static void main(String[] args) {
        findLongestSubString(new LongestSubString());
    }

    private static void findLongestSubString(LongestSubString solution) {
        System.out.println(solution.lengthOfLongestSubstring("abcdeafbdgcbb"));//7
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));//3
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));//1
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));//3
    }
}
