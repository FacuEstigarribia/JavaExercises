package org.exercise.lexicagraphicalOrder.exercises;

import java.util.HashMap;
import java.util.Map;

/*
Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it.
If there is no such character, return '_'.
 */

public class FirstNotRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abacabad"; // Example string
        System.out.println(firstNonRepeatingChar(s)); // Output should be 'c'
    }

    public static char firstNonRepeatingChar(String s) {
        // Map to store character counts
        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeating character found
        return '_';
    }
}

