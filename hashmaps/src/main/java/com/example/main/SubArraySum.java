package com.example.main;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

    /**
     * Given an integer array nums and an integer k,
     * find the number of sub-arrays whose sum is equal to k.
     */
    public static void main(String[] args) {

        int k = 3;
        int[] nums = new int[]{1, 2, 1, 2, 1};
        System.out.println(subArrayOfSum(nums, k));
    }

    private static int subArrayOfSum(int[] nums, int k) {

        // Count the frequency
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);

        int ans = 0;
        int curr = 0;

        for (int num : nums) {
            curr += num;
            ans += counts.getOrDefault(curr - k, 0);
            counts.put(curr, counts.getOrDefault(curr, 0) + 1);
        }

        return ans;
    }
}
