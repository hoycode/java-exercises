/* Exercise 25

Write a Java program to add two numbers without using any arithmetic operators

*/

import java.util.Scanner;

public class NoArithmetics{

    public static void main (String[] args){
        
    Scanner in = new Scanner (System.in);

    System.out.printf("Enter the first number: ");
    int num1 = in.nextInt();

    System.out.printf("Enter the second number: ");
    int num2 = in.nextInt();

    while(num2 != 0){

        int carry = num1 & num2;
        num1 = num1 ^ num2;
        num2= carry << 1;
    }

    System.out.print("Sum: "+num1); 
    System.out.print("\n");       

    } 

}