package org.exercise.lexicagraphicalOrder.exercises;

import java.util.Arrays;
import java.util.Locale;

public class StringAnagram {

    /*
    * An anagram string is a string which is it writing in reverse we get another different word
    * */
    public static void main(String[] args) {
        String firstWord = "Bcad16";
        String secondWord = "ABCD162";
        firstWord = firstWord.toLowerCase(Locale.ROOT).replaceAll("[^a-z1-9]", "");
        secondWord = secondWord.toLowerCase(Locale.ROOT).replaceAll("[^a-z1-9]", "");
        if (firstWord.length() == secondWord.length()) {
            char[] array1 = firstWord.toCharArray();
            Arrays.sort(array1);
            char[] array2 = firstWord.toCharArray();
            Arrays.sort(array2);

            if (Arrays.equals(array1, array2)) {
                System.out.println("Both Words are anagrams.");
            }
        } else System.out.println("Words are not Anagrams.");

    }

}
