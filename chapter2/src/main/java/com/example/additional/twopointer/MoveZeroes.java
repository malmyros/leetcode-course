package com.example.additional.twopointer;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0 && nums[j] == 0) {
                int current = nums[i];
                nums[i] = nums[j];
                nums[j] = current;
            }

            if (nums[j] != 0) {
                j++;
            }
        }
    }
}
