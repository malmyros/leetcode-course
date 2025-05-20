package com.example.main;

import java.util.*;

public class FindPlayersWithZeroOrOneLosses {

    public static void main(String[] args) {

        int[][] matches = {
                {1, 3},
                {2, 3},
                {3, 6},
                {5, 6},
                {5, 7},
                {4, 5},
                {4, 8},
                {4, 9},
                {10, 4},
                {10, 9}
        };
        System.out.println(findWinners(matches));
    }

    private static List<List<Integer>> findWinners(int[][] matches) {

        Map<Integer, Integer> winners = new HashMap<>();
        Map<Integer, Integer> losers = new HashMap<>();

        for (int[] match : matches) {
            int loser = match[1];
            losers.put(loser, losers.getOrDefault(loser, 0) + 1);

            int winner = match[0];
            winners.put(winner, winners.getOrDefault(winner, 0) + 1);
        }

        List<Integer> oneLoss = new ArrayList<>();
        for (int loser : losers.keySet()) {

            if (losers.get(loser) == 1) {
                oneLoss.add(loser);
            }

            winners.remove(loser);
        }

        List<Integer> noLoss = new ArrayList<>(winners.keySet());
        Collections.sort(noLoss);
        Collections.sort(oneLoss);
        return List.of(noLoss, oneLoss);
    }
}
