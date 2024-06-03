package org.exercise.lexicagraphicalOrder.exercises;

import java.util.*;

/*
Coins = 400;
Menu = { "coffee" : 100
"cake" : 200
"popcorn" : 225
}

Write a method that will show all possible combinations
that can be bought for coins
 */
public class Coins {
    private static  final int COINS =600;
    public static HashMap<String, Integer> menu = new HashMap<>();
    public static final int MINIMUM_VALUE = 100;
    public static void main(String[] args) {
        menu.put("coffee", 100);
        menu.put("cake", 200);
        menu.put("popcorn", 225);

        printAllCombinations();
    }
    public static void printAllCombinations(){
        HashSet<List<String>> solutionSet = new HashSet<>();

        if(COINS < MINIMUM_VALUE){
            System.out.println("The amount of coins is more lower than the min value.");
        } else {
            for(Map.Entry<String, Integer> entry : menu.entrySet()){
                List<String> firstStep = new ArrayList<>();
                firstStep.add(entry.getKey());
                availableCombination(COINS - entry.getValue(), firstStep, solutionSet);
            }
            System.out.println(solutionSet);
        }

    }
    public static void availableCombination(int coins, List<String> currentBranch, HashSet<List<String>> solutionSet){
        for (Map.Entry<String, Integer> entry : menu.entrySet()) {
            if (coins >= entry.getValue()) {
                List<String> auxList = new LinkedList<>(currentBranch);
                auxList.add(entry.getKey());
                availableCombination(coins - entry.getValue(), auxList, solutionSet);
            }
        }
    }
}
