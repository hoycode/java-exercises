/* Exercise 3

Write a Java program to convert all characters in a string to uppercase

*/

import java.util.Scanner;

public class ConvertUpperCase {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String input = in.nextLine();

        System.out.println("UpperCase String: " + input.toUpperCase());

    }
}
