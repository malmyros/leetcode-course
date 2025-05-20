package com.example.main;

public class NumberOfWaysToSplitAnArray {

    /**
     * Given an integer array nums, find the number of ways to split the
     * array into two parts so that the first section has a sum greater
     * than or equal to the sum of the second section.
     * <p/>
     * The second section should have at least one number.
     */
    public static void main(String[] args) {

        int[] nums = new int[]{10, 4, -8, 7};
        System.out.println(numberOfWaysToSplit(nums));
    }

    private static int numberOfWaysToSplit(int[] nums) {

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i -1] + nums[i];
        }

        int ans = 0;
        for (int i = 0; i < nums.length -1; i++) {
            int left = prefix[i];
            int right = prefix[nums.length -1] - prefix[i];
            if (left >= right) {
                ans++;
            }
        }

        return ans;
    }
}
