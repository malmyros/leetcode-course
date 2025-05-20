package com.example.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountingElements {

    /**
     * Given an integer array arr, count how many elements x there are, such that x + 1 is also in arr.
     * If there are duplicates in arr, count them separately.
     */
    public static void main(String[] args) {

//        int[] nums = new int[]{1, 2, 3};
//        int[] nums = new int[]{1, 1, 3, 3, 5, 5, 7, 7};
        int[] nums = new int[]{1, 1, 2, 2};
        System.out.println(countElements(nums));
    }

    private static int countElements(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        List<Integer> items = new ArrayList<>();
        for (int num : arr) {

            int x = num + 1;
            if (set.contains(x)) {
                items.add(x);
            }
        }

        return items.size();
    }
}
