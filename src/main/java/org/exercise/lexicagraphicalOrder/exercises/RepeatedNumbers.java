package org.exercise.lexicagraphicalOrder.exercises;
import java.util.*;

public class RepeatedNumbers {


    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,5,6};

        System.out.println(hasRepeatedNumbers(array));

    }


    public static boolean hasRepeatedNumbers(int [] array){
        Set<Integer> set = new HashSet<>();
        for (int n : array){
            if(set.contains(n)){
                return true;
            } else {
                set.add(n);
            }
        }
        return false;
    }
}
