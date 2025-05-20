package com.example.main;

public class DeleteNodeAtPosition {

    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);

        head.next = one;
        one.next = two;
        printValues(head);
        System.out.println("----");

        deleteNode(one);
        printValues(head);
    }

    private static void deleteNode(ListNode prevNode) {
        prevNode.next = prevNode.next.next;
    }

    private static void printValues(ListNode listNode) {

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
