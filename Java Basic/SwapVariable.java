/*Exercise 6

Write a Java program to swap two variables

*/

import java.util.Scanner;

public class SwapVariable {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int aux = 0;

        System.out.print("Introduce the first number: ");
        int num1 = in.nextInt();

        System.out.print("Introduce the seconde number: ");
        int num2 = in.nextInt();

        System.out.println("num1:num2 values = " + num1 + ":" + num2);

        aux = num1;
        num1 = num2;
        num2 = aux;

        System.out.println("num1:num2 values = " + num1 + ":" + num2);

    }
}
