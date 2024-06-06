package org.exercise.lexicagraphicalOrder;

/*
 Details:
Write a Java method that extracts value from a String between square brackets.

For example:
input:
 String input = "ignore me [extract:me] ignore me!";
output:
"extract:me"

 */
public class Task4 {
    public static void main(String[] args) {
        String input = "ignore me [extract:me] ignore me!";
        System.out.println(extractString(input));
    }

    private static String extractString(String str){
        String extracted = str.substring(str.indexOf('[') + 1, str.indexOf(']'));
        return extracted;
    }
}
