package com.example.main.doublylinkedlist;

public class DoubleListNodeOperations {

    public static void main(String[] args) {

        DoubleListNode head = new DoubleListNode(0);
        DoubleListNode one = new DoubleListNode(1);
        DoubleListNode two = new DoubleListNode(2);
        DoubleListNode three = new DoubleListNode(3);

        head.next = one;
        one.prev = head;
        one.next = two;
        two.prev = one;
        two.next = three;
        three.prev = two;
        three.next = head;
        head.prev = three;
    }

    private static void addNode(
            DoubleListNode node,
            DoubleListNode nodeToAdd) {

        DoubleListNode prevNode = node.prev;
        nodeToAdd.next = node;
        nodeToAdd.prev = prevNode;
        prevNode.next = nodeToAdd;
        node.prev = nodeToAdd;
    }

    private static void deleteNode(
            DoubleListNode node) {

        DoubleListNode prevNode = node.prev;
        DoubleListNode nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
}
