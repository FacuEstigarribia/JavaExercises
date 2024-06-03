package org.exercise.lexicagraphicalOrder;

/*
Given input string "3[asdf]" generate output: asdfasdfasdf
 */
public class PracticalInterview {
    public static void main(String[] args) {
        System.out.println(generateString("3[asdf]"));
    }
    public static String generateString(String input) {
        int repeat = Integer.parseInt(input.substring(0, 1));
        String word = input.substring(input.indexOf("[") + 1, input.length() - 1);
        return word.repeat(repeat);
    }
}
