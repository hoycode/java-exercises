/* Exercise 1

Write a Java program to take three numbers from the user and print the greatest number

*/

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        int num1, num2, num3, greatest;

        System.out.print("Enter the 1st number: ");
        num1 = in.nextInt();

        System.out.print("Enter the 2nd number: ");
        num2 = in.nextInt();

        System.out.print("Enter the 3rd number: ");
        num3 = in.nextInt();

        if(num1 > num2 && num1 > num3){
            greatest = num1;
        } else if(num2 > num1 && num2 > num3){
            greatest = num2;
        } else
            greatest = num3;

            System.out.print("The greatest number is " + greatest);
    }
}