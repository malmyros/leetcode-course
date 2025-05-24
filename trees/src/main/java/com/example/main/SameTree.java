package com.example.main;

public class SameTree {

    public static void main(String[] args) {

        TreeNode first = new TreeNode(1);
        first.left = new TreeNode(2);

        TreeNode second = new TreeNode(1);
        second.right = new TreeNode(2);

        boolean ans = sameTrees(first, second);
        System.out.println(ans);
    }

    private static boolean sameTrees(TreeNode p, TreeNode q) {
        return dfs(p, q);
    }

    private static boolean dfs(TreeNode p, TreeNode q) {

        // We have reached the end for both trees
        if (p == null && q == null) {
            return true;
        }

        // We have reached the end for one of the two trees
        if (p == null || q == null) {
            return false;
        }

        boolean left = dfs(p.left, q.left);
        boolean right = dfs(p.right, q.right);
        return p.val == q.val && left && right;
    }
}
