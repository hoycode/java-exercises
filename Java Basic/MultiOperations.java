/*Exercise 4

Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers

*/

import java.util.Scanner;

public class MultiOperations {
    public static void main(String[] args){

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Introduce the first number: ");
            int num1 = in.nextInt();

            System.out.print("Introduce the second number: ");
            int num2 = in.nextInt();

            System.out.println("Sum of two numbers: " + num1 + " + " + num2 + " = " + (num1 + num2)); //Sum
            System.out.println("Subtraction of two numbers: " + num1 + " - " + num2 + " = " + (num1 - num2)); //Sub
            System.out.println("Division of two numbers: " + num1 + " / " + num2 + " = " + (num1 / num2)); //Division
            System.out.println("Multiplication of two numbers: " + num1 + " * " + num2 + " = " + (num1 * num2)); //Multiply
            System.out.println("Remainder of two numbers: " + num1 + " % " + num2 + " = " + (num1 % num2)); //Remainder
        }

    }
}
