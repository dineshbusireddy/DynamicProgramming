package com.dynamicprogramming.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charAndIndexMap = new HashMap<>();
        int result = 0;
        for (int currentPos = 0, startPos = 0; currentPos < s.length(); currentPos++) {
            Character value = s.charAt(currentPos);
            if (charAndIndexMap.containsKey(value)) {
                startPos = Math.max(charAndIndexMap.get(s.charAt(currentPos)), startPos);
            }
            result = Math.max(result, currentPos - startPos + 1);
            charAndIndexMap.put(value, currentPos + 1);
        }
        return result;
    }

}
