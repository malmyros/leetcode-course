package com.example.additional.monotonic;

public class IsMonotonicArray {

    /**
     * An array is monotonic if it is either monotone increasing or monotone decreasing.
     */
    public static void main(String[] args) {

//        int[] nums = new int[]{1, 3, 3, 4}; // Monotonically increasing
        int[] nums = new int[]{6, 5, 4, 4}; // Monotonically decreasing
//        int[] nums = new int[]{1, 1, 1}; // Either
        System.out.println(isMonotonic(nums));
    }

    private static boolean isMonotonic(int[] nums) {

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < nums.length; i++) {

            int cur = nums[i];
            int prev = nums[i - 1];

            if (cur < prev) {
                isIncreasing = false;
            } else if (cur > prev) {
                isDecreasing = false;
            }
        }

        return isIncreasing || isDecreasing;
    }
}
