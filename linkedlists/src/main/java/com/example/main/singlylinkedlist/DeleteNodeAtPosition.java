package com.example.main.singlylinkedlist;

public class DeleteNodeAtPosition {

    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);

        head.next = one;
        one.next = two;
        ListNodeUtils.printValues(head);
        System.out.println("----");

        deleteNode(one);
        ListNodeUtils.printValues(head);
    }

    private static void deleteNode(ListNode prevNode) {
        prevNode.next = prevNode.next.next;
    }


}
