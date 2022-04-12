/* Exercise 3

Write a Java program that takes two numbers and display the product of two numbers

*/

import java.util.Scanner;

public class ProductTwoNumbers {
    
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce the first number: ");
        int num1 = in.nextInt();

        System.out.print("Introduce the second number: ");
        int num2 = in.nextInt();

        System.out.println("Product of two numbers: " + num1 + " x " + num2 + " = " + num1 * num2);
    }
}
