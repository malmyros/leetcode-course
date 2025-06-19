package com.example.main.depthfirstsearch;

import com.example.main.TreeNode;

public class MaxAncestorDifference {

    static int result = 0;

    public static void main(String[] args) {

        TreeNode root = new TreeNode(8);
        TreeNode three = new TreeNode(3);
        TreeNode one = new TreeNode(1);
        TreeNode six = new TreeNode(6);
        TreeNode four = new TreeNode(4);
        TreeNode seven = new TreeNode(7);
        TreeNode ten = new TreeNode(10);
        TreeNode fourteen = new TreeNode(14);
        TreeNode thirteen = new TreeNode(13);

        root.left = three;
        three.left = one;
        three.right = six;
        six.left = four;
        six.right = seven;

        root.right = ten;
        ten.right = fourteen;
        fourteen.right = thirteen;

        int result = maxAncestorDiff(root);
        System.out.println(result);
    }

    private static int maxAncestorDiff(TreeNode root) {

        if (root == null) {
            return 0;
        }

        result = 0;
        helper(root, root.val, root.val);
        return result;
    }

    private static void helper(TreeNode node, int curMax, int curMin) {

        if (node == null) {
            return;
        }

        int possibleResult = Math.max(Math.abs(curMax - node.val), Math.abs(curMin - node.val));
        result = Math.max(result, possibleResult);

        curMax = Math.max(curMax, node.val);
        curMin = Math.min(curMin, node.val);
        helper(node.left, curMax, curMin);
        helper(node.right, curMax, curMin);
    }
}
