/*Exercise 7

Write a Java program to convert a decimal number to binary numbers

*/

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args){

        int decimalNum, quot, i=1, j;
        int bin_num[] = new int[100];
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a Decimal number: ");
            decimalNum = in.nextInt();
        }

        quot = decimalNum;

        while(quot != 0){
            bin_num[i++] = quot % 2;
            quot /= 2;
        }

        System.out.println("Binary Number is: ");
        for(j = i - 1; j > 0; j--){
            System.out.print(bin_num[j]);
        }

        //System.out.println("\n");

    }
}
