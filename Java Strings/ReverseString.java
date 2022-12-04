/* Exercise 11

Write a java program to reverse a String

*/

import java.util.Scanner;

public class ReverseString {
    public static void main (String[] args){

        Scanner in = new Scanner (System.in);
        String nStr = "";

        System.out.print("Enter a string: ");
        String input = in.nextLine();

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            nStr = ch + nStr;
        }

        System.out.println("Reversed String: " + nStr);
    }
}
