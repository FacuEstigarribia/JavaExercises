package org.exercise.lexicagraphicalOrder;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
//        int [] array = {3, 1, 8};
//
//        List<List<Integer>> result = pairs(array);
//        for (List<Integer> pair : result) {
//            System.out.println(pair);
//        }

        int edad = 17;

        String s = edad >= 18 ? "Es mayor de edad" : "Es menor de edad";

        System.out.println(s);
    }
    public static List<List<Integer>> pairs(int[] array){
        List<List<Integer>> pairsList = new ArrayList<>();
        int size = array.length;
        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j ++){
                List<Integer> pair = new ArrayList<>();
                pair.add(array[i]);
                pair.add(array[j]);
                pairsList.add(pair);
            }
        }
        return pairsList;
    }
}
