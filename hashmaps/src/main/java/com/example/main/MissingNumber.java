package com.example.main;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    /**
     * Given an array nums containing n distinct numbers in the
     * range [0, n], return the only number in the range that is missing from the array.
     */
    public static void main(String[] args) {

        int[] nums = new int[]{3, 0, 1};
//        int[] nums = new int[]{0, 1};
        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i < nums.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}
