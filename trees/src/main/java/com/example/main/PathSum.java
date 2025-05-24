package com.example.main;

public class PathSum {

    public static int target;

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode four = new TreeNode(4);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        TreeNode eleven = new TreeNode(11);
        TreeNode thirteen = new TreeNode(13);

        root.left = four;
        root.right = eight;
        four.left = eleven;
        eleven.left = seven;
        eleven.right = two;
        eight.left = thirteen;
        eight.right = four;
        four.right = one;

        System.out.println(hasPathSum(root, 22));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
        return dfs(root, 0);
    }

    public static boolean dfs(TreeNode root, int curr) {

        if (root == null) {
            return false;
        }

        boolean isLeaf = root.left == null && root.right == null;
        if (isLeaf) {
            return curr + root.val == target;
        }

        curr += root.val;
        boolean left = dfs(root.left, curr);
        boolean right = dfs(root.right, curr);
        return left || right;
    }
}
