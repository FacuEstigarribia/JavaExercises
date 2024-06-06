package org.exercise.lexicagraphicalOrder;
import java.util.*;
import java.util.stream.Collectors;

/*
Task 3.
A sequence of non-empty strings stringList is given. Get a new sequence of strings,
where each string consists of the first and last characters of the corresponding string in the stringList sequence.
For example:
input: {“asd”, “a”, “basdw”}
output: {“ad”, “aa”, “bw”}

 */
public class Task3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("asfd", "a", "basdw");
        List<String> resul = decodeString(stringList);
        for(String s : resul){
            System.out.println(s);
        }
    }

    private static List<String> decodeString(List<String> stringList){
        return stringList.stream()
                .map(s -> s.length() == 1 ? s + s : "" + s.charAt(0) + s.charAt(s.length() - 1))
                .collect(Collectors.toList());
    }
}
