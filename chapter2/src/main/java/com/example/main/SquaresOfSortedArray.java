package com.example.main;

import java.util.Arrays;

public class SquaresOfSortedArray {

    /**
     * Given an integer array nums sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     */
    public static void main(String[] args) {

//        int[] nums = new int[]{-4, -1, 0, 3, 10};
        int[] nums = new int[]{-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(squaresOfSortedArray(nums)));
    }

    private static int[] squaresOfSortedArray(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        for (int start = 0, end = n - 1, k = n -1; start <= end;) {

            int a = nums[start] * nums[start];
            int b = nums[end] * nums[end];

            if (a > b) {
                result[k--] = a;
                start++;
            } else {
                result[k--] = b;
                end--;
            }
        }

        return result;
    }
}
