/*Exercise 10

Write a Java program to display the n terms of odd natural number and their sum

*/

import java.util.Scanner;

public class OddNatural {
    public static void main (String[] args){

        int sum = 0;

        Scanner in = new Scanner (System.in);
        
        System.out.print("> Enter the number of terms: ");
        int terms = in.nextInt();

        for(int i = 1; i <= terms; i++){
            System.out.println(2 * i - 1);

            sum += 2 * i - 1;
        }

        System.out.println("The sum of odd natural numbers up to " + terms + " is: " + sum);
    }
}
