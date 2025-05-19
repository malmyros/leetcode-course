package com.example;

public class SubArrayProductLessThanTarget {

    public static void main(String[] args) {

        int target = 100;
        int[] nums = new int[]{10, 5, 2, 6};
        System.out.println(productLessThanTarget(nums, target));
    }

    private static int productLessThanTarget(int[] nums, int target) {

        if (target <= 0) {
            return 0;
        }

        int ans = 0;
        int left = 0;
        int curr = 1;

        for (int right = 0; right < nums.length; right++) {

            curr *= nums[right];
            while (curr >= target) {
                curr /= nums[left];
                left++;
            }

            ans += right - left + 1;
        }

        return ans;
    }
}
