package com.example.main;

import java.util.Arrays;
import java.util.Stack;

public class MonotonicQueue {

    private final Stack<Integer> queue;

    public MonotonicQueue() {
        queue = new Stack<>();
    }

    public Stack<Integer> push(int[] nums) {
        for (int num : nums) {
            while (!queue.isEmpty() && queue.peek() >= num) {
                queue.pop();
            }
            queue.push(num);
        }

        return queue;
    }

    public static void main(String[] args) {

        MonotonicQueue monotonicQueue = new MonotonicQueue();

        int[] nums = new int[]{1, 5, 8, 15, 23, 14};
        System.out.println(Arrays.toString(monotonicQueue.push(nums).toArray()));
    }
}
