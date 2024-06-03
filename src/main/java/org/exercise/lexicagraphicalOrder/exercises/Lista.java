package org.exercise.lexicagraphicalOrder.exercises;

import java.util.ArrayList;
import java.util.List;

public class Lista {



    public static void main(String[] args) {
        ArrayList listDias = new ArrayList<>();
        listDias.add(3, "juernes");

        System.out.println(listDias.stream().filter(n -> n == "juernes"));

        ArrayList listDos = new ArrayList<>(listDias);
        System.out.println(listDos);
    }
}
