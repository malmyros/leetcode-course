package com.example.main;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {

    public static void main(String[] args) {

        String s = "abbaca";
        System.out.println(removeAdjacentDuplicates(s));
    }

    private static String removeAdjacentDuplicates(String s) {

        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {

                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        stack.forEach(sb::append);
        return sb.toString();
    }
}
