/* Exercise 12

Write a Java program that reads an integer and check whether it is negative, zero, or positive

*/

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = in.nextDouble();

        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else
            System.out.print("The number is zero");

    }
}
