/* Exercise 6

Write a Java program to replace all the ‘d’ characters with ‘f’ characters

*/

import java.util.Scanner;

public class ReplaceChar {
  public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        System.out.print("Enter a string: ");
        String input = in.nextLine();

        System.out.println("Original String: " + input);
        System.out.println("Replace 'd' by 'f' String: " + input.replace('d', 'f'));
  }  
}
