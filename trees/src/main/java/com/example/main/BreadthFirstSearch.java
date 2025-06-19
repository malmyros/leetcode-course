package com.example.main;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

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

        printAllNodes(root);
    }

    public static void printAllNodes(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int nodesInCurrentLevel = queue.size();

            for (int i = 0; i < nodesInCurrentLevel; i++) {

                TreeNode node = queue.remove();
                System.out.println(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }
}
