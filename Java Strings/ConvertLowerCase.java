/* Exercise 2

Write a Java program to convert all characters in a string to lowercase

*/

import java.util.Scanner;

public class ConvertLowerCase {
    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        System.out.print("Enter a phrase: ");
        String input = in.nextLine();

        System.out.println("LowerCase String: " + input.toLowerCase());

    }
}
