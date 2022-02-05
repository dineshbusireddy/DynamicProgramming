package com.dynamicprogramming.leetcode;

public class StringInString {

    public int strStr(String haystack, String needle) {
        int result = -1;

        if (haystack != null && needle != null && haystack.length() >= needle.length()) {
            if (needle.length() != 0) {
                for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                    if (haystack.charAt(i) == needle.charAt(0)
                            && needle.equals(haystack.substring(i, i + needle.length()))) {
                        result = i;
                        break;
                    }
                }
            } else {
                result = 0;
            }
        }

        return result;
    }
}
