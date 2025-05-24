package com.example.main;

public class TotalSum {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(0);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);

        root.left = one;
        root.right = two;
        one.left = three;
        one.right = four;
        three.left = six;
        four.left = seven;
        four.right = eight;
        two.right = five;

        int ans = totalSum(root);
        System.out.println(ans);
    }

    private static int totalSum(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int left = totalSum(node.left);
        int right = totalSum(node.right);
        return node.val + left + right;
    }
}
