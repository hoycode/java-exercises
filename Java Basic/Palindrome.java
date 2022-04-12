/* Exercise 24

Write a Java program to check if a positive number is a palindrome or not

*/

import java.util.Scanner;

public class Palindrome {

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = in.nextInt();

        System.out.printf("Is %d a palindrome number?\n", num);
        System.out.println(isPalindrome(num));
        

    }

    private static boolean isPalindrome(int num){

        String str = String.valueOf(num);

        int i = 0;
        int j = str.length() - 1;

        while(i < j){
            if(str.charAt(i++) != str.charAt(j--)){
                return false;
            }
        }

        return true;
       
    }

    
}
