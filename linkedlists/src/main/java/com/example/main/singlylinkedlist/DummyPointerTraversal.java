package com.example.main.singlylinkedlist;

public class DummyPointerTraversal {

    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);

        head.next = one;
        one.next = two;

        System.out.println(getSumOfNodes(head));
    }

    private static int getSumOfNodes(ListNode listNode) {

        ListNode dummy = listNode;

        int ans = 0;
        while (dummy != null) {
            ans += dummy.val;
            dummy = dummy.next;
        }

        return ans;
    }
}
