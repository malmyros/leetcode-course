package com.example.main;

import java.util.HashMap;
import java.util.Map;

public class CountNumbersOfNiceSubArrays {

    /**
     * Given an array of positive integers nums and an integer k.
     * Find the number of sub-arrays with exactly k odd numbers in them.
     */
    public static void main(String[] args) {

        int k = 3;
        int[] nums = new int[]{1, 1, 2, 1, 1};
        System.out.println(numberOfNiceSubArrays(nums, k));
    }

    private static int numberOfNiceSubArrays(int[] nums, int k) {

        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);

        int curr = 0;
        int ans = 0;

        for (int num : nums) {
            curr += num % 2;
            ans += counts.getOrDefault(curr - k, 0);
            counts.put(curr, counts.getOrDefault(curr, 0) + 1);
        }

        return ans;
    }
}
