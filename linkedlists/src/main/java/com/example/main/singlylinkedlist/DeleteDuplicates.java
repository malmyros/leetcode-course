package com.example.main.singlylinkedlist;

public class DeleteDuplicates {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);

        head.next = one;
        one.next = two;

        ListNode result = deleteDuplicates(head);
        ListNodeUtils.printValues(result);
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;
        while (current != null && current.next != null) {

            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
