/*Exercise 5

Write a Java program that takes five numbers as input to calculate and print the average of the numbers

*/

import java.util.Scanner;

public class AvgFiveNumbers {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("1st number: ");
        int num1 = in.nextInt();

        System.out.print("2nd number: ");
        int num2 = in.nextInt();

        System.out.print("3rd number: ");
        int num3 = in.nextInt();

        System.out.print("4rd number: ");
        int num4 = in.nextInt();

        System.out.print("5th number: ");
        int num5 = in.nextInt();
        
        System.out.println("Numbers: " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
        System.out.println("Average: " + (num1 + num2 + num3 + num4 + num5) / 5);

    
    }

}
