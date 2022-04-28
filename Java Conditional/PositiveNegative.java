/* Exercise 3

Write a Java program to test a number is positive or negative

*/

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {
        double num;
        String numS = "";
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            num = in.nextDouble();
        }

        if (num != 0) {

            if (num > 0) {
                numS = "positive";
            } else
                numS = "negative";

            System.out.printf("The number is %s", numS);

        } else
        
            System.out.println("The number is neither positive or negative");

    }

}
