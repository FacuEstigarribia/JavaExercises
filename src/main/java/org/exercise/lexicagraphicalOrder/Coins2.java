package org.exercise.lexicagraphicalOrder;

import java.util.HashMap;
import java.util.Map;

/*
Write a method that displays the optimal amount of products that you can buy
Coins = 400;
Menu = { “coffee” : 100
                 “cake” : 200
		“popcorn” : 225
}
*/
public class Coins2 {

    public static void main(String[] args) {
        Map<String, Integer> menu = new HashMap<>();
        menu.put("coffe", 100);
        menu.put("cake", 200);
        menu.put("popcorn", 255);
        int coins = 400;
        amountOfProducts(coins, menu);
    }

    private static void amountOfProducts(int coins, Map<String, Integer> menu){
        for(Map.Entry<String, Integer> entry : menu.entrySet()){
            int amount = 0;
            String product = entry.getKey();
            int price = entry.getValue();
            while(coins >= price){
                amount =  coins / price;
                coins -= price * amount;
            }
            System.out.println(product + " Amount: " + amount + " Coins left: " + coins);
        }
    }
}
