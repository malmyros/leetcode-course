package com.example;

import java.util.Arrays;

public class SquaresOfSortedArray {

    /**
     * Given an integer array nums sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     */
    public static void main(String[] args) {

        int[] nums = new int[]{-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(squaresOfSortedArray(nums)));
    }

    private static int[] squaresOfSortedArray(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            nums[start] = nums[start] * nums[start];
            nums[end] = nums[end] * nums[end];
            start++;
            end--;
        }

        return nums;
    }
}
