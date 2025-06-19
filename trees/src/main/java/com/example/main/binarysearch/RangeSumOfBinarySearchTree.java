package com.example.main.binarysearch;

import com.example.main.TreeNode;

public class RangeSumOfBinarySearchTree {

    /**
     * Given the root node of a binary search tree and two integers low and high,
     * return the sum of values of all nodes with a value in the inclusive range [low, high].
     */
    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        TreeNode five = new TreeNode(5);
        TreeNode fifteen = new TreeNode(15);
        TreeNode three = new TreeNode(3);
        TreeNode seven = new TreeNode(7);
        TreeNode eighteen = new TreeNode(18);

        root.left = five;
        root.right = fifteen;

        five.left = three;
        five.right = seven;

        fifteen.right = eighteen;

        System.out.println(rangeSumBST(root, 7, 15));
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {

        if (root == null) {
            return 0;
        }

        int ans = 0;
        if (low <= root.val && root.val <= high) {
            ans += root.val;
        }

        if (low < root.val) {
            ans += rangeSumBST(root.left, low, high);
        }

        if (root.val < high) {
            ans += rangeSumBST(root.right, low, high);
        }

        return ans;
    }
}
