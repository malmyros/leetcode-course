package com.example;

public class FindMaxConsecutiveOnes {

    public static void main(String[] args) {

        int k = 2;
        int[] nums = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        System.out.println(maxConsecutiveOnes(nums, k));
    }

    // max consecutive 1
    // maximum flips = 2
    private static int maxConsecutiveOnes(int[] nums, int k) {

        int left = 0;
        int curr = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                curr++;
            }

            while (curr > k) {
                if (nums[left] == 0) {
                    curr--;
                }
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
