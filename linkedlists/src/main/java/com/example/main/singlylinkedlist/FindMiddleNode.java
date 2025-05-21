package com.example.main.singlylinkedlist;

public class FindMiddleNode {

    /**
     * Given the head of a linked list with an odd number
     * of nodes head, return the value of the node in the middle.
     */
    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);

        head.next = one;
        one.next = two;

        System.out.println(findMiddleNode(head));
    }

    private static int findMiddleNode(
            ListNode head) {

        int length = 0;
        ListNode dummyNode = head;

        while (dummyNode.next != null) {
            length++;
            dummyNode = dummyNode.next;
        }

        for (int i = 0; i < length / 2; i++) {
            head = head.next;
        }

        return head.val;
    }
}
