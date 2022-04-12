/* Exercise 26

Write a Java program to add all the digits of a given positive integer

*/

import java.util.Scanner;

public class AddDigits {

    public static void main(String[] args){

        int m, n, sum = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        m = in.nextInt();

        while(m > 0){

            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }

        System.out.println("Sum of Digits: " + sum);


    }

}
