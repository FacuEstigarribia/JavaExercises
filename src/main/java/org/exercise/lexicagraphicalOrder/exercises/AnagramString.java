package org.exercise.lexicagraphicalOrder.exercises;

import java.util.*;

public class AnagramString {
    public static boolean areAnagram(String str1, String str2){
        boolean result = false;
        int size1 = str1.length();
        int size2 = str2.length();
        char [] chars1 = str1.toCharArray();
        char [] chars2 = str2.toCharArray();
        if(size1 != size2){
            return result;
        }
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for(int i = 0; i < size1; i++){
            if(chars1[i] != chars2[i]){
                result = false;
                return result;
            }
        }
        result = true;
        return result;
    }
    public static void main(String[] args) {
        String str1 = "eatt";
        String str2 = "teat";
        System.out.println(areAnagram(str1, str2));
    }
}
