package com.example.main;

public class LongestSubstringContainingAtMostOneZero {

    /**
     * Find the longest substring containing at most
     * 1 zero in a given string
     */
    public static void main(String[] args) {

        String input = "1101100111";
        System.out.println(longestSubString(input));
    }

    private static int longestSubString(String s) {

        int left = 0;
        int curr = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '0') {
                curr++;
            }

            while (curr > 1) {
                if (s.charAt(left) == '0') {
                    curr--;
                }

                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
