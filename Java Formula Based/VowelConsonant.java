/* Exercise 16

Java program to check vowel or consonant

*/

import java.util.Scanner;

public class VowelConsonant{
    public static void main(String[] args){

        try (Scanner in = new Scanner (System.in)) {
            System.out.print("Enter a character: ");
            char ch = in.next().charAt(0);

            switch(ch){

                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");

            }
        }
    }
}