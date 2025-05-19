package com.example;

public class FindBestSubArrayWithTargetLength {

    public static void main(String[] args) {

        int k = 4;
        int[] nums = new int[]{3, -1, 4, 12, -8, 5, 6};
        System.out.println(findBestSubArray(nums, k));
    }

    private static int findBestSubArray(int[] nums, int k) {

        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }

        int ans = curr;
        for (int i = k; i < nums.length; i++) {

            int res = nums[i] - nums[i - k];
            curr += res;
            ans = Math.max(ans, curr);
        }

        return ans;
    }
}
