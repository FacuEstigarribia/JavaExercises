package org.exercise.lexicagraphicalOrder.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {


    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("facundo");
        lista.add("jose");
        lista.add("julieta");
        lista.add("cristiano");
        lista.add("rolando");

        Stream<String> stringStream = (Stream<String>) lista.stream()
                .filter(n -> n.indexOf(0) == 'j')
                .collect(Collectors.toList());

    }


}
