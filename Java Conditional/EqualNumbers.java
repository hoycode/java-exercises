/* Exercise 3

Write a Java program that accepts three numbers and check All numbers are equal or not

*/

import java.util.Scanner;

public class EqualNumbers {
    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        //First Number
        System.out.print("Enter the first number: ");
        double num1 = in.nextDouble();

        //Second Number
        System.out.print("Enter the first number: ");
        double num2 = in.nextDouble();

        //Third Number
        System.out.print("Enter the first number: ");
        double num3 = in.nextDouble();

        if(num1 == num2 && num1 == num3){
            System.out.println("All numbers are equal");
        } else if((num1 == num2) || (num1 == num3) || (num2 == num3)){
            System.out.println("Some numbers are equal but not all of them");
        } else 
            System.out.println("All numbers are different");
    }
}
