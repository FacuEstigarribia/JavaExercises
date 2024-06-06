package org.exercise.lexicagraphicalOrder;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Crear un hashmap con claves nombres y valores numeros de telefono.
Hay que devolver los nombres cuyos numero de telefono es par
 */
public class DevolverPares {

    public static void main(String[] args) {
        HashMap<String, Integer> contactsMap = new HashMap<>();
        contactsMap.put("george", 14387234);
        contactsMap.put("john", 14387233);
        contactsMap.put("tony", 14387231);
        contactsMap.put("margaret", 14387238);

        List<String> result = returnContactWithEvenNumber(contactsMap);
        showNames(result);

        List<String> resultWithStream = withStream(contactsMap);
        System.out.println("Show withStream method");
        showNames(resultWithStream);
    }

    private static List<String> returnContactWithEvenNumber(HashMap<String, Integer> contacts){
        List<String> returnList = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : contacts.entrySet()){
            if(entry.getValue() % 2 == 0){
                returnList.add(entry.getKey());
            }
        }
        return  returnList;
    }

    public static void showNames(List<String> names){
        for(String name : names){
            System.out.println(name);
        }
    }

    private static List<String> withStream(HashMap<String, Integer> contacts){
        return contacts.entrySet().stream().filter(n -> n.getValue() % 2 == 0)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
