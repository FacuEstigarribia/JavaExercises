package org.exercise.lexicagraphicalOrder;

import java.util.Stack;

public class ParenthesisExercise {
    public static boolean isValid(String parentheses) {
        Stack<Character> stack = new Stack<>();

        for (char c : parentheses.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] testCases = {"()", ")(()))", "(", "(())((()())())", "[]{}()", "[({})]", "[(])"};

        for (String testCase : testCases) {
            boolean isValid = isValid(testCase);
            System.out.println(testCase + " => " + isValid);
        }
    }
}

