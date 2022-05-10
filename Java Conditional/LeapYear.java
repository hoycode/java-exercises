/* Exercise 5

Write a Java program that takes a year from user and print whether that year is a leap year or not

year % 400 == 0
||
year % 4 == 0 && year % 100 != 0

*/

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int year = in.nextInt();

            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("It's a leap year!");
            } else
                System.out.println("It's not a leap year!");
        }

    }
}
