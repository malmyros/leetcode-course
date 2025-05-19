package com.example;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        char[] input = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] result = reverseString(input);
        System.out.println(Arrays.toString(result));
    }

    private static char[] reverseString(char[] input) {

        int start = 0;
        int end = input.length - 1;

        while (end > start) {

            char current = input[start];
            input[start] = input[end];
            input[end] = current;
            start++;
            end--;
        }

        return input;
    }
}
