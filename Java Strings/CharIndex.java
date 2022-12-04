/* Exercise 9

Write a Java program to get the character at the given index within the String

*/

import java.util.Scanner;

public class CharIndex {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = in.nextLine();

        System.out.print("Enter the character index: ");
        int index = in.nextInt();

        System.out.println("Character at chosen index: " + input.charAt(index));
    }
}
