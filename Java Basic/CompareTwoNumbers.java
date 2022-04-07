/*Exercise 11

Write a Java program to compare two numbers

*/

import java.util.Scanner;

public class CompareTwoNumbers {
    
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce the first number: ");
        int num1 = in.nextInt();

        
        System.out.print("Introduce the second number: ");
        int num2 = in.nextInt();

        // Conditional ==

        if(num1 == num2){
            System.out.printf("%d == %d\n", num1, num2);
        }

        //Conditional !=

        if(num1 != num2){
            System.out.printf("%d != %d\n", num1, num2);
        }

        //Conditional >

        if(num1 > num2){
            System.out.printf("%d > %d\n", num1, num2);
        }
        
        //Conditional <

        if(num1 < num2){
            System.out.printf("%d < %d\n", num1, num2);
        }

                
        //Conditional >=

        if(num1 >= num2){
            System.out.printf("%d >= %d\n", num1, num2);
        }

                        
        //Conditional <=

        if(num1 <= num2){
            System.out.printf("%d <= %d\n", num1, num2);
        }
    }
}
