package com.example.main;

public class LeastCommonAncestor {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode two = new TreeNode(2);
        TreeNode seven = new TreeNode(7);
        TreeNode four = new TreeNode(4);
        TreeNode one = new TreeNode(1);
        TreeNode zero = new TreeNode(0);
        TreeNode eight = new TreeNode(8);

        root.left = five;
        root.right = one;
        five.left = six;
        five.right = two;
        two.left = seven;
        two.right = four;
        one.left = zero;
        one.right = eight;

        TreeNode lca = lowestCommonAncestor(root, five, one);
        System.out.println(lca.val);
    }

    private static TreeNode lowestCommonAncestor(
            TreeNode root,
            TreeNode p,
            TreeNode q) {

        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        if (left != null) {
            return left;
        }

        return right;
    }
}
