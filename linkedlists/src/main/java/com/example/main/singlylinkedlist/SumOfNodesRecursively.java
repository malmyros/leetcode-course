package com.example.main.singlylinkedlist;

public class SumOfNodesRecursively {

    public static void main(String[] args) {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);

        one.next = two;
        two.next = three;

        System.out.println(sumOfNodes(one));
    }

    private static int sumOfNodes(ListNode listNode) {

        if (listNode == null) {
            return 0;
        }

        return listNode.val + sumOfNodes(listNode.next);
    }
}
