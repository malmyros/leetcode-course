package com.example.main;

public class CountGoodNodes {

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

        System.out.println(countGoodNodes(root, Integer.MIN_VALUE));
    }

    private static int countGoodNodes(TreeNode root, int maxSoFar) {
        return dfs(root, maxSoFar);
    }

    private static int dfs(TreeNode node, int maxSoFar) {

        if (node == null) {
            return 0;
        }

        int left = dfs(node.left, Math.max(maxSoFar, node.val));
        int right = dfs(node.right, Math.max(maxSoFar, node.val));

        // Sum the total good nodes from each recursion
        int ans = left + right;

        // Add one to the good nodes if the current node value
        // we are traversing is greater or equal to the maxSoFar
        if (node.val >= maxSoFar) {
            ans++;
        }

        return ans;
    }
}
