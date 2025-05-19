package com.example;

public class LongestValidSubArray {

    public static void main(String[] args) {

        int[] nums = new int[]{3, 2, 1, 3, 1, 1};
        System.out.println(longestValidSubArray(nums, 5));
    }

    private static int longestValidSubArray(int[] nums, int target) {

        int left = 0;
        int cur = 0;
        int answer = 0;

        for (int right = 0; right < nums.length; right++) {

            cur += nums[right];
            while (cur > target) {
                cur -= nums[left];
                left--;
            }

            answer = Math.max(cur, right - left + 1);
        }

        return answer;
    }

}
