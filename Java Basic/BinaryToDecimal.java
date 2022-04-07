/*Exercise 8

Write a Java program to convert a binary number to decimal number

*/

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        long binaryNumber, decimalNumber = 0, j = 1, rem;

        System.out.print("Enter a Binary number: ");
        binaryNumber = in.nextLong();

        while (binaryNumber != 0) 
        {
         rem = binaryNumber % 10;
         decimalNumber = decimalNumber + rem * j;
         j = j * 2;
         binaryNumber = binaryNumber / 10;
        }
        System.out.println("Decimal Number: " + decimalNumber);
        
    }    
}
