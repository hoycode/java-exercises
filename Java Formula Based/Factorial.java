/* Exercise 18

Java Program to find factorial of number

*/

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args){

        try (Scanner in = new Scanner(System.in)) {
            int fact = 1;

            System.out.print("> Enter a Integer number: ");
            int num = in.nextInt();

            for(int i = 1; i <= num; i++){
                fact = fact * i;
            }

            System.out.println("Factorial " + fact);
        }
    }

}
