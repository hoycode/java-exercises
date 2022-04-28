/* Exercise 25

Java Program To Calculate Power Of Number

*/

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            int base, exponent, result = 1;

            System.out.print("Enter the base value: ");
            base = in.nextInt();

            System.out.print("Enter the base exponent: ");
            exponent = in.nextInt();

            while (exponent != 0) {

                result *= base;

                --exponent;
            }
            System.out.println("Result: " + result);

        }
    }
}
