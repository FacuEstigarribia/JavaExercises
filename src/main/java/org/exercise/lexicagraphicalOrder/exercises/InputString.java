package org.exercise.lexicagraphicalOrder.exercises;
import java.util.Stack;
/**
 * 3. Given this input: "3[asd]" you have to generate an output string:
 * # Q1
 * ## input => "3[asd]"  // pass
 * ## output => "asdasdasd"
 * # Q2
 * ## input => "3[a]4[b]"
 * ## output => "aaabbbb"
 * # Q3
 * ## input => "3[a2[b]]"
 * ## interim output => "3[abb]"
 * ## output => "abbabbabb" (edited)
 */
public class InputString {
//
///
    public static String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int count = 0;
                while (Character.isDigit(s.charAt(i))) {
                    count = count * 10 + (s.charAt(i) - '0');
                    i++;
                }
                countStack.push(count);
            } else if (c == '[') {
                stringStack.push(result);
                result = new StringBuilder();
                i++;
            } else if (c == ']') {
                StringBuilder temp = result;
                result = stringStack.pop();
                int repeatTimes = countStack.pop();
                for (int j = 0; j < repeatTimes; j++) {
                    result.append(temp);
                }
                i++;
            } else {
                result.append(c);
                i++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Q1
        String input1 = "3[asd]";
        String output1 = decodeString(input1);
        System.out.println("Q1\ninput => " + input1 + "\noutput => " + output1);

        // Q2
        String input2 = "3[a]4[b]";
        String output2 = decodeString(input2);
        System.out.println("Q2\ninput => " + input2 + "\noutput => " + output2);

        // Q3
        String input3 = "3[a2[b]]";
        String output3 = decodeString(input3);
        System.out.println("Q3\ninput => " + input3 + "\noutput => " + output3);
    }
}

