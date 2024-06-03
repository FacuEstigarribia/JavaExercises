package org.exercise.lexicagraphicalOrder.exercises;

import java.util.HashMap;
import java.util.Map;

/*
Given an array a that contains only numbers in the range from 1 to a.length,
find the first duplicate number for which the second occurrence has the minimal index.
In other words, if there are more than 1 duplicated numbers,
return the number for which the second occurrence has a smaller index than the second occurrence of the other number does.
If there are no such elements, return -1.
 */
public class FirstDuplicate {

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 4, 3, 2}; // Example array
        System.out.println(solution(array)); // Output should be 3
    }

    public static int solution(int[] a) {
        // Map to store the index of each element
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            // If the number is found again
            if (indexMap.containsKey(num)) {
                // Return the number if its second occurrence has a smaller index
                if (indexMap.get(num) < i) {
                    return num;
                }
            } else {
                // Otherwise, store the index of the number
                indexMap.put(num, i);
            }
        }
        // If no duplicate found
        return -1;
    }
}
