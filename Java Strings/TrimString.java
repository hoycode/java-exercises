/* Exercise 4

Write a Java program to trim a string(remove whitespaces)

The trim() function removes the whitespaces from both ends of a string

*/

import java.util.Scanner;

public class TrimString {
    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        System.out.print("Enter a string (preferencially with spaces): ");
        String input = in.nextLine();

        System.out.println("Original String: " + input);
        System.out.println("Trim String: " + input.trim());
    }
}
