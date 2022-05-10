/* Exercise 8

Write a java program to check vowel or consonant

*/


import java.util.Scanner;

public class VowelConsonant {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);

        System.out.print("Input a character: ");
        String input = in.next().toLowerCase();

        //Ascii code table
        boolean lowerCase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean upperCase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
        || input.equals("o") || input.equals("u");

        if(input.length() > 1){
            System.out.println("Error. Not a single character.");
        } else if(!(upperCase || lowerCase)){
            System.out.println("Error, input is not a letter. Enter a uppercase or lowercase letter.");
        } else if (vowels){
            System.out.println("The input letter is a vowel.");
        }else
            System.out.println("The input letter is a consonant.");
    }
}
