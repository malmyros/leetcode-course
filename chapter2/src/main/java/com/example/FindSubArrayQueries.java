package com.example;

import java.util.Arrays;

public class FindSubArrayQueries {

    /**
     * Given an integer array nums, an array queries where queries[i] = [x, y]
     * and an integer limit, return a boolean array that represents the answer to each query.
     * A query is true if the sum of the sub-array from x to y is less than limit, or false otherwise.
     */
    public static void main(String[] args) {

        int limit = 13;
        int[] nums = new int[]{1, 6, 3, 2, 7, 2};
        int[][] queries = new int[][]{{0, 3}, {2, 5}, {2, 4}};
        System.out.println(Arrays.toString(findSubArrayAnswers(nums, queries, limit)));
    }

    private static boolean[] findSubArrayAnswers(int[] nums, int[][] queries, int limit) {

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1]  + nums[i];
        }

        boolean[] ans = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {

            int x = queries[i][0];
            int y = queries[i][1];
            int curr = prefix[y] - prefix[x] + nums[x];
            ans[i] = curr < limit;
        }

        return ans;
    }
}
