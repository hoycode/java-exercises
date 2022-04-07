/* Exercise 18

Write a Java program to convert a string to an integer

*/

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        System.out.print("Enter a number(string): ");
        String str = in.nextLine(); //Read a String value

        int result = Integer.parseInt(str); //This line parses a String value to an Integer value

        System.out.printf("The integer is %d", result);
        System.out.println("\n");
        
    }
}
