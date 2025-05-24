package com.example.main;

public class MaxDepth {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(0);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);

        root.left = one;
        root.right = two;
        one.left = three;
        one.right = four;
        two.left = null;
        two.right = five;
        five.left = null;
        five.right = six;

        int result = maxDepth(root);
        System.out.println(result);
    }

    private static int maxDepth(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int left = maxDepth(node.left);
        int right = maxDepth(node.right);
        return Math.max(left, right) + 1;
    }
}
