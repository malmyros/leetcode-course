package com.example.main;

import java.util.HashMap;
import java.util.Map;

public class FindLongestSubString {

    /**
     * You are given a string s and an integer k. Find the length of
     * the longest substring that contains at most k distinct characters.
     */
    public static void main(String[] args) {

        int k = 2;
        String s = "eceba";
        System.out.println(findLongestSubString(s, k));
    }

    private static int findLongestSubString(String s, int k) {

        Map<Character, Integer> counts = new HashMap<>();

        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            counts.put(c, counts.getOrDefault(c, 0) + 1);

            while (counts.size() > k) {

                char remove = s.charAt(left);
                counts.put(remove, counts.getOrDefault(remove, 0) - 1);
                if (counts.get(remove) == 0) {
                    counts.remove(remove);
                }
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
