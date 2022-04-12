/* Exercise 23

Write a Java program to compute the square root of an given integer

*/

import java.util.Scanner;

public class SquareRoot {
    
    public static void main (String[] args){

        double square;
        
        try (Scanner in = new Scanner (System.in)) {
            System.out.print("Enter an Integer: ");
            int num = in.nextInt();

            square = Math.sqrt(num);



            System.out.printf("The square root of %d is %.2f", num, square);
        }
    }
}
