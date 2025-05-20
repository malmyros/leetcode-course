package com.example.main;

public class SumOfSubArray {

    public static void main(String[] args) {

        int start = 2;
        int end = 6;
        int[] nums = new int[]{3, 6, 2, 8, 1, 4, 1, 5};
        System.out.println(sumOfSubArray(nums, start, end));
    }

    private static int sumOfSubArray(int[] nums, int start, int end) {

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        return prefix[end] - prefix[start];
    }
}
