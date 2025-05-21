package com.example.main;

import java.util.*;

public class MovingAverage {

    private final Queue<Integer> queue;
    private final int windowSize;

    public MovingAverage(int size) {
        queue = new LinkedList<>();
        windowSize = size;
    }

    public double next(int val) {
        while (!queue.isEmpty() && queue.size() >= windowSize) {
            queue.poll();
        }
        queue.offer(val);

        Integer sum = queue.stream().reduce(Integer::sum)
                .stream().findFirst()
                .orElse(0);
        return (double) sum / queue.size();
    }

    public static void main(String[] args) {

        MovingAverage movingAverage = new MovingAverage(3);

        List<Double> nums = new ArrayList<>();
        nums.add(movingAverage.next(1));
        nums.add(movingAverage.next(10));
        nums.add(movingAverage.next(3));
        nums.add(movingAverage.next(5));
        System.out.println(Arrays.toString(nums.toArray()));
    }
}
