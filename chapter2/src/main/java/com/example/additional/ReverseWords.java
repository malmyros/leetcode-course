package com.example.additional;

public class ReverseWords {

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {

        String[] s2 = s.split(" ");
        for (int i = 0; i < s2.length; i++) {
            s2[i] = reverseWord(s2[i]);
        }

        return String.join(" ", s2);
    }

    private static String reverseWord(String s2) {

        int left = 0;
        int right = s2.length() -1;
        char[] input = s2.toCharArray();

        while (left < right) {

            char current = input[left];
            input[left] = input[right];
            input[right] = current;
            left++;
            right--;
        }

        return new String(input);
    }
}
