package com.example.main;

import java.util.*;

public class IntersectionOfMultipleArrays {

    /**
     * Given a 2D array nums that contains n arrays of distinct integers,
     * return a sorted array containing all the numbers that appear in all n arrays.
     */
    public static void main(String[] args) {

        int[][] nums = new int[][]{
                {3, 1, 2, 4, 5},
                {1, 2, 3, 4},
                {3, 4, 5, 6}
        };
        System.out.println(intersection(nums));
    }

    private static List<Integer> intersection(int[][] nums) {

        Map<Integer, Integer> frequency = new HashMap<>();
        for (int[] arr : nums) {
            for (int key : arr) {
                frequency.put(key, frequency.getOrDefault(key, 0) + 1);
            }
        }

        int k = nums.length;
        List<Integer> items = new ArrayList<>();
        for (Integer key : frequency.keySet()) {
            if (frequency.get(key) == k) {
                items.add(key);
            }
        }

        Collections.sort(items);
        return items;
    }
}
