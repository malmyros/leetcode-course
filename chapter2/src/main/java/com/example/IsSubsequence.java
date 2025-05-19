package com.example;

public class IsSubsequence {

    /**
     * Given two strings s and t, return true if s is a
     * subsequence of t, or false otherwise.
     */
    public static void main(String[] args) {

        String s = "ace";
        String t = "abcde";
        System.out.println(isSubsequence(s, t));
    }

    private static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
