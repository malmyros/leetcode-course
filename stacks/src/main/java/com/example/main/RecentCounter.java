package com.example.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RecentCounter {

    private final Queue<Integer> queue;

    public RecentCounter() {
        this.queue = new LinkedList<>();
    }

    public int ping(int t) {
        while(!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }
        queue.offer(t);
        return queue.size();
    }

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        RecentCounter recentCounter = new RecentCounter();
        nums.add(recentCounter.ping(1));
        nums.add(recentCounter.ping(100));
        nums.add(recentCounter.ping(3001));
        nums.add(recentCounter.ping(4000));
        System.out.println(nums);
    }
}
