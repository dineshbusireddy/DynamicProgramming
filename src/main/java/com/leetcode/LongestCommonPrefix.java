package com.leetcode;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        if (strs.length > 1) {
            for (int i = 0; i < strs[0].length(); i++) {
                char character = strs[0].charAt(i);
                boolean isCommonPrefix = true;
                for (int j = 1; j < strs.length; j++) {
                    if (i >= strs[j].length() || strs[j].charAt(i) != character) {
                        isCommonPrefix = false;
                        break;
                    }
                }

                if (isCommonPrefix) {
                    result.append(character);
                } else {
                    break;
                }
            }
        } else {
            result.append(strs[0]);
        }
        return result.toString();
    }

}
