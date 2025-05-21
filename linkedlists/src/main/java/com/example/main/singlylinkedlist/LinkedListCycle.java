package com.example.main.singlylinkedlist;

public class LinkedListCycle {

    /**
     * Given the head of a linked list, determine if the linked list has a cycle.
     * There is a cycle in a linked list if there is some node in the list that can
     * be reached again by continuously following the next pointer.
     */
    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);

        head.next = one;
        one.next = two;
        two.next = three;
        three.next = head;

        System.out.println(hasCycle(head));
    }

    private static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
