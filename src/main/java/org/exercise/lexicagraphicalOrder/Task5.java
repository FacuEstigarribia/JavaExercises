package org.exercise.lexicagraphicalOrder;
import java.util.*;
import java.util.stream.Collectors;

/*
Task 5.
A sequence of positive integer values integerList is given.
Get sequence of string representations of only odd integerList values and sort in ascending order.
For example:
input: {1, 2, 3, 4, 5, 6}
output: {“1”, “3", “5”}
At the MIDDLE level, you need to solve the following five tasks:

 */
public class Task5 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        getOddNumbers(integerList);
    }

    private static void getOddNumbers(List<Integer> integers){
        integers.stream()
                .filter(n -> n % 2 != 0)
                .sorted()
                .forEach(System.out::println);

    }
}
