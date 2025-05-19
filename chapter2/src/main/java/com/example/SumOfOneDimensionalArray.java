package com.example;

import java.util.Arrays;

public class SumOfOneDimensionalArray {

    /**
     * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
     * Return the running sum of nums.
     */
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSums(nums)));
    }

    private static int[] runningSums(int[] nums) {

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        return prefix;
    }
}
