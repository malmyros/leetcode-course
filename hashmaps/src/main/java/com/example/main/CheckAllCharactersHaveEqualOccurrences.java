package com.example.main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckAllCharactersHaveEqualOccurrences {

    /**
     * Given a string s, determine if all characters have the same frequency.
     */
    public static void main(String[] args) {

        String s = "abacbc";
        System.out.println(sameFrequency(s));
    }

    private static boolean sameFrequency(String s) {

        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        Set<Integer> set = new HashSet<>(frequency.values());
        return set.size() == 1;
    }
}
