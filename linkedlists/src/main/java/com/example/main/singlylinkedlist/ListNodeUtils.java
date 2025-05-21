package com.example.main.singlylinkedlist;

public class ListNodeUtils {

    private ListNodeUtils() {
    }

    public static void printValues(ListNode listNode) {

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static void removeNode(ListNode prevNode) {
        prevNode.next = prevNode.next.next;
    }
}
