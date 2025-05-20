package com.example.main;

public class MyListNode {

    private static class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);

        one.next = two;
        two.next = three;

        System.out.println(one.val);
        System.out.println(one.next.val);
        System.out.println(one.next.next.val);
    }
}
