package com.dynamicprogramming.valid_parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    Map<Character, Character> parenthesesMap = new HashMap<Character, Character>() {
        {
            put('}', '{');
            put(')', '(');
            put(']', '[');
        }
    };

    public boolean isValid(String s) {
        boolean result = true;
        Stack<Character> parenthesesStock = new Stack<>();

        if (s != null && !s.isEmpty()) {
            for (int i = 0; i < s.length(); i++) {
                if (parenthesesMap.containsKey(s.charAt(i))) {
                    if (parenthesesStock.isEmpty() || parenthesesMap.get(s.charAt(i)) != parenthesesStock.pop()) {
                        result = false;
                        break;
                    }
                } else {
                    parenthesesStock.push(s.charAt(i));
                }
            }

            if (!parenthesesStock.isEmpty()) {
                result = false;
            }
        }

        return result;
    }

}
