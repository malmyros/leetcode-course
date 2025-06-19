package com.example.main.breadthfirstsearch;

import com.example.main.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

    /**
     * Given the root of a binary tree, imagine yourself standing on the right side of it.
     * Return the values of the nodes you can see ordered from top to bottom.
     */
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);

        root.left  = two;
        root.right = three;
        three.left = four;
        three.right = five;

        System.out.println(rightSideView(root));
    }

    public static List<Integer> rightSideView(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int currentLength = queue.size();
            int prev = 0;

            for (int i = 0; i < currentLength; i++) {

                TreeNode node = queue.remove();
                prev = node.val;

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            ans.add(prev);
        }

        return ans;
    }
}
