package com.example.main;

public class AddNodeAtPosition {

    public static void main(String[] args) {

        ListNode zero = new ListNode(0);
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        zero.next = one;
        one.next = two;

        System.out.println("Printing current structure");
        printValues(zero);

        ListNode four = new ListNode(4);
        addNode(one, four);

        System.out.println("Printing structure after inserting node 4 at position of node 2");
        printValues(zero);
    }

    private static void addNode(ListNode prevNode, ListNode nodeToAdd) {
        nodeToAdd.next = prevNode.next;
        prevNode.next = nodeToAdd;
    }

    private static void printValues(ListNode listNode) {

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
