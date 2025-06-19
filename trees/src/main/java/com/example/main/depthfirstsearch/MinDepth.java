package com.example.main.depthfirstsearch;

import com.example.main.TreeNode;

public class MinDepth {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode nine = new TreeNode(9);
        TreeNode twenty = new TreeNode(20);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);

        root.left = nine;
        root.right = twenty;
        twenty.left = fifteen;
        twenty.right = seven;

        int ans = minDepth(root);
        System.out.println(ans);
    }

    private static int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        if (root.left == null) {
            return minDepth(root.right) + 1;
        }

        if (root.right == null) {
            return minDepth(root.left) + 1;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return Math.min(left, right) + 1;
    }
}
