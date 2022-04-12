/* Exercise 3

Java Program to find area of triangle

*/

import java.util.Scanner;

public class AreaTriangle{

    public static void main (String[] args){

        Scanner in = new Scanner (System.in);
        double area;

        System.out.print("Enter the base value: ");
        double base = in.nextDouble();

        System.out.print("Enter the heigth value: ");
        double heigth = in.nextDouble();

        area = (base * heigth) / 2;

        System.out.printf("The area of the triangle is: %.2f", area);

    }
}