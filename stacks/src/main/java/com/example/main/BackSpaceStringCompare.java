package com.example.main;

import java.util.Stack;

public class BackSpaceStringCompare {

    /**
     * Given two strings s and t, return true if they are equal when both are typed
     * into empty text editors. '#' means a backspace character.
     */
    public static void main(String[] args) {

        String s = "ab##";
        String t = "c#d#";
        System.out.println(areStringsEqual(s, t));
    }

    private static boolean areStringsEqual(String s, String t) {
        String s1 = getCleanString(s);
        String s2 = getCleanString(t);
        return s1.equals(s2);
    }

    private static String getCleanString(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (stack.isEmpty() && c != '#') {
                stack.push(c);
            } else {

                if (c == '#') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    stack.push(c);
                }
            }
        }


        stack.forEach(sb::append);
        return sb.toString();
    }
}
