package org.exercise.lexicagraphicalOrder;

import java.util.Scanner;



    //you need to write a program
    // that returns "fizz" if the number is a multiplier of 3,
    // return "buzz" if its multiplier of 5,
    // and return "fizzbuzz" if the number is divisible by both 3 and 5.
    //
    //Read more: https://www.java67.com/2015/10/how-to-solve-fizzbuzz-in-java.html#ixzz86h9ZcHbM
public class FizzbuzzExercise {
    private static Scanner scanner;
    public static void main(String[] args) {
        Integer myNumber = takeNumber();

        if( myNumber % 3 == 0 && myNumber % 5 == 0){
            System.out.println("Fizzbuzz");
        } else if (myNumber % 3 == 0) {
            System.out.println("Fizz");
        } else if (myNumber % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println("Ninguna de los divisores esta permitido");

        }
    }

    private static Integer takeNumber(){
        scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        Integer number = scanner.nextInt();
        return number;
    }

}
