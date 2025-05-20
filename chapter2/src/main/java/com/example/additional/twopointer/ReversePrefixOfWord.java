package com.example.additional.twopointer;

public class ReversePrefixOfWord {

    public static void main(String[] args) {

        String word = "abcdefd";

        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    private static String reversePrefix(String word, char ch) {

        int right = 0;
        char[] input = word.toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == ch) {
                right = i;
                break;
            }
        }

        int left = 0;
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
