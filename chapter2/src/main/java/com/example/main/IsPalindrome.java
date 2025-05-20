package com.example.main;

public class IsPalindrome {


    /**
        Given an input string determine
        if the input is a palindrome.
     */
    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
    }

    private static boolean isPalindrome(String input) {

        int n = input.length();
        int left = 0;
        int right = n - 1;

        while (left < right) {

            int a = input.charAt(left);
            int b = input.charAt(right);

            if (a != b) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }
}