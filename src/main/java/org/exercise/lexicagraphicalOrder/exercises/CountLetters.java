package org.exercise.lexicagraphicalOrder.exercises;
import java.util.*;

public class CountLetters {


    public static void main(String[] args) {
        uniqueWords("Hello World");
    }

    /**
     * // "Hello world" count letters
     * * // h - 1
     * * // e - 1
     * * // l - 3 ...
     */
    public static void uniqueWords(String str){
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : chars){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) +1);
            } else{
                map.put(ch, 1);
            }
        }
        for(Map.Entry entry : map.entrySet()){
            System.out.println("Letter: " + entry.getKey() + ". " + "Amount of times that was found: " + entry.getValue());
        }
    }
}
