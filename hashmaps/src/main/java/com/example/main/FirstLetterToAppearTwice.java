package com.example.main;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwice {

    public static void main(String[] args) {

        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }

    private static char repeatedCharacter(String s) {

        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (seen.contains(c)) {
                return c;
            }
            seen.add(c);
        }

        return ' ';
    }
}
