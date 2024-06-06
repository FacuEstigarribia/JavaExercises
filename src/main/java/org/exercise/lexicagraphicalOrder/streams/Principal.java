package org.exercise.lexicagraphicalOrder.streams;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

///https://www.arquitecturajava.com/java-predicate/
public class Principal {
    public static void main(String[] args) {
//        List<Persona> lista = new ArrayList<>();
//        Persona p1 = new Persona("pepe", "perez", 20);
//        Persona p2 = new Persona("angel", "sanchez", 30);
//        Persona p3 = new Persona("pepe", "blanco", 40);
//        lista.add(p1);
//        lista.add(p2);
//        lista.add(p3);
//
//        lista.stream().forEach(p -> System.out.println(p.getNombre()));

        String input = "3[asdf]";
        System.out.println(decoderString(input));





    }

    private static String decoderString(String str){
        int repeat = Integer.parseInt(str.substring(0,1));
        String asdf = str.substring(2,6);
        return asdf.repeat(repeat);
    }



}
