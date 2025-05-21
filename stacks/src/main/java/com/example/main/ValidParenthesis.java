package com.example.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

        String s = "{([]){}}";
        System.out.println(isValidParenthesis(s));
    }

    private static boolean isValidParenthesis(String s) {

        Map<Character, Character> matching = new HashMap<>();
        matching.put('(', ')');
        matching.put('[', ']');
        matching.put('{', '}');

        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (matching.containsKey(c)) {
                stack.push(c);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char prev = stack.pop();
                if (matching.get(prev) != c) {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
