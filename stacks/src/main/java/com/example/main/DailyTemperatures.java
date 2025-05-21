package com.example.main;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

    /**
     * Given an array of integers temperatures that represents the daily temperatures,
     * return an array answer such that answer[i] is the number of days you have to wait
     * after the i t h i th day to get a warmer temperature. If there is no future day
     * that is warmer, have answer[i] = 0 instead.
     */
    public static void main(String[] args) {

        int[] temperatures = new int[]{40, 35, 32, 37, 50};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }

    private static int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();

        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {

                int curr = temperatures[i];
                while (!stack.isEmpty() && curr > temperatures[stack.peek()]) {
                    int top = stack.pop();
                    int diff = i - top;
                    ans[top] = diff;
                }
                stack.push(i);
            }
        }

        return ans;
    }
}
