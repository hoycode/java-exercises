/* Exercise 13

Write a Java program that reads an positive integer and count the number of digits

*/

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        int count = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");

        if (in.hasNextInt()) {

            int num = in.nextInt();

            if (num < 0) {
                System.out.println("Enter a positive integer please");
            } else if (num > 0) {
    
                while (num != 0) {
                    num = num / 10;
                    ++count;
                }
                System.out.println("Number of digits: " + count);
    
            } else
                System.out.println("The number can't be zero");
        } else
            System.out.println("The value is not a number");

    }
}
