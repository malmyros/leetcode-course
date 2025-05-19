package com.example;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String[] input = new String[]{"h", "e", "l", "l", "o"};
        String[] result = reverseString(input);
        System.out.println(Arrays.toString(result));
    }

    private static String[] reverseString(String[] input) {

        int start = 0;
        int end = input.length - 1;

        while (end > start) {

            String current = input[start];
            input[start] = input[end];
            input[end] = current;
            start++;
            end--;
        }

        return input;
    }
}
