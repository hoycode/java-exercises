/* Exercise 14

Java program to find surface area area of cube

*/

import java.util.Scanner;
import java.lang.Math;

public class SurfaceCube {
    public static void main(String[] args){

        try (Scanner in = new Scanner(System.in)) {
            double surface;

            System.out.print("Enter the side of cube: ");
            double edge = in.nextInt();


            surface = 6 * Math.pow(edge, 2) ;

            System.out.printf("The surface of Cube is: %.2f", surface);
        }

    }
}
