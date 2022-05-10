/* Exercise 15

Write a java program that accepts three numbers from the user and check if numbers are in “increasing” or “decreasing” order.

*/

import java.util.Scanner;

public class NumbersOrder {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // First Number
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        // Second Number
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        // Third Number
        System.out.print("Enter the third number: ");
        int num3 = in.nextInt();

        if(num1 < num2 && num2 < num3){
            System.out.println("The numbers are increasing.");
        } else if(num1 > num2 && num2 > num3){
            System.out.println("The numbers are decreasing");
        } else
            System.out.println("The numbers are neither increasing or decreasing");

    }
}
