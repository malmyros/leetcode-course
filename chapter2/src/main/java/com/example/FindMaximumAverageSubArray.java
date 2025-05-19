package com.example;

public class FindMaximumAverageSubArray {

    public static void main(String[] args) {

        int k = 4;
        int[] nums = new int[]{1, 12, -5, -6, 50, 3};
        System.out.println(maximumAverageSubArray(nums, k));
    }

    // Constraint max average
    // Length 4
    private static double maximumAverageSubArray(int[] nums, int k) {

        double curr = 0;
        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }

        double ans = curr / k;
        for (int i = k; i < nums.length; i++) {

            curr += nums[i] - nums[i - k];
            ans = Math.max(ans, curr / k);
        }

        return ans;
    }
}
