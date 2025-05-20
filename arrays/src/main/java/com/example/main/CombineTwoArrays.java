package com.example.main;

import java.util.ArrayList;
import java.util.List;

public class CombineTwoArrays {

    /**
     * Given two sorted integer arrays arr1 and arr2,
     * return a new array that combines both of them and is also sorted
     */
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 4, 7, 20};
        int[] arr2 = new int[]{3, 5, 6};
        List<Integer> results = combineArrays(arr1, arr2);
        System.out.println(results);
    }

    private static List<Integer> combineArrays(int[] arr1, int[] arr2) {

        List<Integer> ans = new ArrayList<>(arr1.length + arr2.length);
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                ans.add(arr1[i]);
                i++;
            } else {
                ans.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            ans.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            ans.add(arr2[j]);
            j++;
        }

        return ans;
    }
}
