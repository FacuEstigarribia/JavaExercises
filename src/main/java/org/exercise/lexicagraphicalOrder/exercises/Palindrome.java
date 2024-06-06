package org.exercise.lexicagraphicalOrder.exercises;
import java.util.*;

public class Palindrome {
            public static void main(String[] args) {
                String s = "facund";
                System.out.println("Palabra: " + s + " - es palindroma? " + isPalindrome2(s));


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

        public static boolean isPalindrome2(String s){
            boolean result = false;
            int length = s.length();
            int pivot = length / 2;
            String sub1 = s.substring(0, pivot);
            String sub2 = s.substring(pivot + 1, length);
            char[] subChar1 = sub1.toCharArray();
            char[] subChar2 = sub2.toCharArray();

            Arrays.sort(subChar1);
            Arrays.sort(subChar2);

            for(int i = 0; i < subChar1.length; i++){
                if(subChar1[i] != subChar2[i]){
                    return result;
                }
            }
            result = true;
            return result;
        }
}
