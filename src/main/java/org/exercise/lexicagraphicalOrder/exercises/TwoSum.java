package org.exercise.lexicagraphicalOrder.exercises;
/**
 * Write a function that takes an array of numbers (integers for the tests) and a target number.
 * It should find two different items in the array that, when added together, give the target value.
 * The indexes of these items should then be in a tuple / list (depending on your language)
 * like so: (index1, index2).
 * The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers; target will always be the sum of two different items from that array).
 */
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2};
        System.out.println(Arrays.toString(twoSum(arr, 4)));

    }

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{
                        map.get(target - numbers[i]), i};
            }
            map.put(numbers[i], i);
        }
        return new int[]{};
    }
}
