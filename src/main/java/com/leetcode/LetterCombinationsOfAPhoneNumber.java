package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {
    Map<Character, String> numberAndLetters = new HashMap<Character, String>() {
        {
            put('0', "");
            put('1', "");
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits != null && !digits.isEmpty()) {
            letterCombinationRecursion("", 0, digits, result);
        }
        return result;
    }

    private void letterCombinationRecursion(String currentLetter, int index,
                                                    String digits, List<String> result) {
        if (index == digits.length()) {
            result.add(currentLetter);
            return;
        }
        String letters = numberAndLetters.get(digits.charAt(index));
        for (int i = 0; i < letters.length(); i++) {
            letterCombinationRecursion(currentLetter + letters.charAt(i), index + 1, digits, result);
        }
    }
}
