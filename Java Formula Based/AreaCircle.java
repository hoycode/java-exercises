/* Exercise 1

Java Program to find area of circle

*/

import java.util.Scanner;
import java.lang.Math;

public class AreaCircle {

    public static void main(String[] args){

        double area;

        Scanner in = new Scanner (System.in);

        System.out.print("Introduce the radius value: ");
        double radius = in.nextDouble();

        area = Math.PI * (radius * radius);

        System.out.printf("The area of the circle is %.2f ", area);

    }

    
}
