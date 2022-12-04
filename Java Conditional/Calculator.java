/* Exercise 17

Write a Java program to create a simple calculator

*/

import java.util.Scanner;
import java.lang.Math;

public class Calculator{
    public static void main (String[] args){
        double va1, va2;
        char operator;

        Scanner in = new Scanner (System.in);

        System.out.print("Enter the value for variable 'a': ");
        va1 = in.nextDouble();
        System.out.println("Variable 'a' value: " + va1);

        System.out.print("Enter an operator (eg. + | - | * | / | ^ ): ");
        operator = in.next().charAt(0);
        System.out.println("Chosen operator: " + operator);

        System.out.print("Enter the value for variable 'b': ");
        va2 = in.nextDouble();
        System.out.println("Variable 'b' value: " + va2);

        System.out.print("Result : " +  va1 + " " + operator + " " + va2 +  " = ");      


        if(operator == '+'){System.out.print(va1 + va2);}
        else if (operator == '-'){System.out.print(va1 - va2);}
        else if (operator == '*'){System.out.print(va1 * va2);}
        else if (operator == '/'){System.out.print(va1 / va2);}
        else if (operator == '^'){
            System.out.print(Math.pow(va1, va2));
       
        } else
            System.out.print("Enter a valid operator!");
    }
}