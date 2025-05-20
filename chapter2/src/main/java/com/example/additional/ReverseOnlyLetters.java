package com.example.additional;

public class ReverseOnlyLetters {

    public static void main(String[] args) {

        String s = "a-bC-dEf-ghIj";
        // j-Ih-gfE-dCba
        // j-Ih-g-fEdCba

        String result = reverseOnlyLetters(s);
        System.out.println(result);
    }

    public static String reverseOnlyLetters(String s) {

        char[] input = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {

            boolean isLeftC = Character.isLetter(input[left]);
            boolean isRightC = Character.isLetter(input[right]);

            if (isLeftC && isRightC) {
                char current = input[left];
                input[left] = input[right];
                input[right] = current;
                left++;
                right--;
            } else if (!isLeftC) {
                left++;
            } else {
                right--;
            }
        }

        return new String(input);
    }
}
