package com.example.main.singlylinkedlist;

public class SumOfNodes {

    public static void main(String[] args) {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);

        one.next = two;
        two.next = three;

        System.out.println(sumOfNodes(one));
    }

    private static int sumOfNodes(ListNode listNode) {

        int ans = 0;
        while (listNode != null) {
            ans += listNode.val;
            listNode = listNode.next;
        }

        return ans;
    }
}
