package org.exercise.lexicagraphicalOrder.exercises;

import java.util.stream.Collectors;

public class HeterogramVerifier {

    public static boolean isHeterogram(String word) {
        return word.toLowerCase().chars()
                .filter(Character::isLetter)
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet())
                .size() == word.toLowerCase().replaceAll("[^a-z]", "").length();
    }

    public static void main(String[] args) {
        String word1 = "programming";
        String word2 = "hello";
        String word3 = "heterogram";

        System.out.println(word1 + " is a heterogram: " + isHeterogram(word1));
        System.out.println(word2 + " is a heterogram: " + isHeterogram(word2));
        System.out.println(word3 + " is a heterogram: " + isHeterogram(word3));
    }
}

