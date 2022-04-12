/* Exercise 4

Java Program to find area of equilateral triangle

*/

import java.util.Scanner;
import java.lang.Math;

public class AreaEquilateralTriangle{

    public static void main (String[] args){

        try (Scanner in = new Scanner(System.in)) {
            double area;
            
            System.out.print("Enter the length side value: ");
            double lengthSide = in.nextDouble();

            area = (Math.sqrt(3) / 4) * Math.pow(lengthSide, 2);

            System.out.printf("The area of Equilateral Triangle is: %.2f", area);
        }

    }
}