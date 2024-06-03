package org.exercise.lexicagraphicalOrder.exercises;

import java.util.Locale;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("Facundo"));
        String str = reverse("sofia");
        System.out.println(str);
    }

    public static String reverseString(String word){

         StringBuilder stringBuilder = new StringBuilder(word);
         stringBuilder.reverse();
         return stringBuilder.toString();
    }

    public static String reverse(String input){
        input = input.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]", "");
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

}
