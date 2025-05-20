package com.example.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int target = 8;
        int[] nums = new int[]{5, 2, 7, 10, 3, 9};
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> dic = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int complement = target - num;
            if (dic.containsKey(complement)) {
                return new int[]{i, dic.get(complement)};
            }
            dic.put(num, i);
        }

        return new int[] { -1, -1};
    }
}
