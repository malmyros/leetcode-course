package com.example.main;

public class TwoSum {

    /*
        Given a sorted array of unique
        integers and a target integer
        return true if there exists a pair
        of numbers that sum to the target
     */
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 4, 6, 8, 9, 14, 15};
        System.out.println(isSumOfTwo(nums, 13));
        System.out.println(isSumOfTwo(nums, 8));
    }

    private static boolean isSumOfTwo(int[] nums, int target) {

        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {

            int sum = nums[left] + nums[right];
            if (sum == target) {
                return true;
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
}
