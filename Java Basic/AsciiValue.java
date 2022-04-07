/*Exercise 4

Write a Java program to print the ascii value of a given character

*/

import java.util.Scanner;

public class AsciiValue{

    public static void main (String[] args){
        char chr;

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce a character: ");
        chr = in.next().charAt(0);

        int castAscii = (int) chr;

        System.out.print("The ASCII value of A is: "+ castAscii);
    }
}