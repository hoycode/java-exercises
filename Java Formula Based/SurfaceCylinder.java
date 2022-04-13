/* Exercise 13

Java program to find surface area of cylinder

*/

import java.util.Scanner;
import java.lang.Math;

public class SurfaceCylinder {

    public static void main(String[] args){

        try (Scanner in = new Scanner(System.in)) {
            double surface;

            System.out.print("Enter the radius value: ");
            double radius = in.nextInt();

            System.out.print("Enter the heigth value: ");
            double heigth = in.nextInt();

            surface = 2 * Math.PI * radius * (radius + heigth);

            System.out.printf("The surface of Cuboid is: %.2f", surface);
        }


    }
    
}
