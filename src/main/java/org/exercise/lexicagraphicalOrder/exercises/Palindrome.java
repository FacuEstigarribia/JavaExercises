package org.exercise.lexicagraphicalOrder.exercises;
import java.util.*;

public class Palindrome {
            public static void main(String[] args) {
            System.out.println(isPalindrome("neuquen"));


//            Map<String, Integer> map = new HashMap<>();
//            map.put("jorge", 1198764);
//            map.put("julio", 1198764);
//            map.put("betty", 1198767);
//            map.put("julieta", 1198763);
//
//            for(Map.Entry<String, Integer> mp : map.entrySet()){
//                if(mp.getValue() % 2 == 0){
//                    System.out.println(mp.getKey());
//                }
//            }
        }

        public static boolean isPalindrome (String word){
            int counter = 0;
            char[] wordArray = word.toCharArray();
            Map<Character, Integer> mapitaUwu = new HashMap<>();
            for (Character e : wordArray) {
                if (mapitaUwu.containsKey(e)){
                    mapitaUwu.replace(e, mapitaUwu.get(e)+1);
                } else {
                    mapitaUwu.put(e, 1);
                }
            }
            for (Character letter : mapitaUwu.keySet()) {
                if (mapitaUwu.get(letter) % 2 != 0){
                    counter++;
                }
            }
            return 2 > counter;
        }
}
