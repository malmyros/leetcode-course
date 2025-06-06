package com.example.main;

import java.util.HashSet;
import java.util.Set;

public class IsSentencePangram {

    public static void main(String[] args) {

        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isSentencePangram(s));
    }

    private static boolean isSentencePangram(String s) {

        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            characterSet.add(c);
        }

        return characterSet.size() == 26;
    }
}
