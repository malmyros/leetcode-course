package com.example.main.singlylinkedlist;

public class ReverseList {

    /**
     * Reverse a sorted linked list
     */
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(3);
        ListNode tail = new ListNode(4);

        head.next = one;
        one.next = two;
        two.next = tail;

        ListNode result = reverseList(head);
        ListNodeUtils.printValues(result);
    }

    private static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}
