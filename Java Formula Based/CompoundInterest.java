/* Exercise 21

Java Program to calculate compound interest

*/

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            double principal, rate, time, unit, ci;

            System.out.print("Enter principal amount: ");
            principal = in.nextDouble();

            System.out.print("Enter annual interest rate: ");
            rate = in.nextDouble() / 100;

            System.out.print("Enter time invested: ");
            time = in.nextDouble();

            System.out.print("Enter the number of times the interest is compounded: ");
            unit = in.nextDouble();

            ci = principal * Math.pow(1 + (rate / unit), unit * time) - principal;

            System.out.printf("Compound Interest after %s years: %.2f", String.valueOf(time), ci);

        }

    }
}