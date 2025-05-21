package com.example.main.singlylinkedlist;

public class FindMiddleFastSlowPointer {

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

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow == null ? -1 : slow.val;
    }
}
