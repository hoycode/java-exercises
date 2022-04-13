/* Exercise 12

Java program to find surface area of cuboid

*/

import java.util.Scanner;

public class SurfaceCuboid {

    public static void main(String[] args){

        try (Scanner in = new Scanner(System.in)) {
            double surface;

            System.out.print("Enter the length value: ");
            double length = in.nextInt();

            System.out.print("Enter the width value: ");
            double width = in.nextInt();

            System.out.print("Enter the heigth value: ");
            double heigth = in.nextInt();

            surface = 2 * (length * width + width * heigth + length * heigth);

            System.out.printf("The surface of Cuboid is: %.2f", surface);
        }


    }
    
}
