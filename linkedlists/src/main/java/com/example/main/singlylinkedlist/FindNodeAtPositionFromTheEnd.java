package com.example.main.singlylinkedlist;

public class FindNodeAtPositionFromTheEnd {

    /**
     * Example 3: Given the head of a linked list and an integer k, return the
     * kth node from the end.
     * For example, given the linked list that represents
     * 1 -> 2 -> 3 -> 4 -> 5 and k = 2,
     * return the node with value 4, as it is the 2nd node from the end.
     */
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        System.out.println(findKthNode(head, 2));
    }

    private static int findKthNode(ListNode head, int k) {

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow == null ? -1 : slow.val;
    }
}
