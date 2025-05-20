package com.example.additional;

public class MinimumCommonValue {

    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 2, 3, 6};
        int[] nums2 = new int[]{2, 3, 4, 5};
        System.out.println(getCommon(nums1, nums2));
    }

    private static int getCommon(int[] nums1, int[] nums2) {

        int minimumCommon = -1;

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else if (nums1[i] == nums2[j]) {

                minimumCommon = minimumCommon > 0
                        ? Math.min(minimumCommon, nums1[i])
                        : nums1[i];
                i++;
                j++;
            }
        }

        return minimumCommon;
    }
}
