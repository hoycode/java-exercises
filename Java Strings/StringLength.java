/* Exercise 7

Write a java program to get the length of a given string

*/

import java.util.Scanner;

public class StringLength {
    public static void main (String[] agrs){

        Scanner in = new Scanner (System.in);

        System.out.print("Enter a string: ");
        String input = in.nextLine();

        System.out.println("The length of the string is " + input.length());

    }
}
