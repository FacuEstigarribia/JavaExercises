package org.exercise.lexicagraphicalOrder;
import java.util.*;
import java.util.stream.Collectors;

public class Mapdemo {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("car", "bicycle", "moto", "skate");

        vehicles.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}
