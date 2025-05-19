package com.example;

public class MinStartValue {

    public static void main(String[] args) {

        int[] nums = new int[]{-3, 2, -3, 4, 2};
        System.out.println(minStartValue(nums));
    }

    private static int minStartValue(int[] nums) {

        int minVal = 0;
        int total = 0;

        for (int num : nums) {
            total += num;
            minVal = Math.min(minVal, total);
        }

        return -minVal + 1;
    }
}
