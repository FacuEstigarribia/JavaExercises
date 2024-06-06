package org.exercise.lexicagraphicalOrder;

import org.exercise.lexicagraphicalOrder.streams.Streams;

import java.util.Arrays;
import java.util.List;

/*
Task 6.
A sequence of positive integers numbers and a sequence of strings stringList are given.
Get a new sequence of strings according to the following rule: for each value n from sequence numbers,
select a string from sequence stringList that starts with a digit and has length n.
If Look at the template on the end of the task before solving the problem.
there are several required strings in the stringList sequence, return the first; if there are none,
then return the string “Not found” For example:
input: {1, 3, 4}, {“1aa”, “aaa”, “1”, “a”}
output: {“1”, “1aa”, “Not Found”}

 */
public class Task6 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,4);
        List<String> stringList = Arrays.asList("1aa", "aaa", "1", "a");

    }

//    private static List<String> getStringListFilter(List<Integer> integers, List<String> strings){
//
//
//    }
}
