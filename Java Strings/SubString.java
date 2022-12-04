/* Exercise 5

Write a Java program to get a substring of a given string between two specified positions

*/

import java.util.Scanner;

public class SubString {
    public static void main (String[] args){

        int subStart, subEnd;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = in.nextLine();

        System.out.print("Introduce the substring start position: ");
        subStart = in.nextInt();

        System.out.print("Introduce the substring end position: ");
        subEnd = in.nextInt();

        System.out.println("SubString: " + input.substring(subStart, subEnd));

        

    }
}
