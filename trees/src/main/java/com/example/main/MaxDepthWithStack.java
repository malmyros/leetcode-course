package com.example.main;

import java.util.Stack;

public class MaxDepthWithStack {

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

    private static class Pair {

        TreeNode treeNode;
        int depth;

        public Pair(TreeNode treeNode, int depth) {
            this.treeNode = treeNode;
            this.depth = depth;
        }
    }

    private static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));
        int ans = 0;

        while (!stack.isEmpty()) {

            Pair pair = stack.pop();
            TreeNode treeNode = pair.treeNode;
            int depth = pair.depth;

            ans = Math.max(ans, depth);

            if (treeNode.left != null) {
                stack.push(new Pair(treeNode.left, depth + 1));
            }

            if (treeNode.right != null) {
                stack.push(new Pair(treeNode.right, depth + 1));
            }
        }

        return ans;
    }
}
