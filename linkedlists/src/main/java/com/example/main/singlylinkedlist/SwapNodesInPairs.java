package com.example.main.singlylinkedlist;

public class SwapNodesInPairs {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);

        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        ListNode result = swapNodesInPairs(head);
        ListNodeUtils.printValues(result);
    }

    private static ListNode swapNodesInPairs(ListNode head) {

        // Nothing to swap it's a one node linked-list
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = head.next;
        ListNode prev = null;

        // If head.next is null we have reached the last
        // element and there is no pair to swap
        while (head != null && head.next != null) {

            if (prev != null) {
                prev.next = head.next;
            }
            prev = head;

            ListNode next = head.next.next;
            head.next.next = head;

            head.next = next;
            head = next;
        }

        return dummy;
    }
}
