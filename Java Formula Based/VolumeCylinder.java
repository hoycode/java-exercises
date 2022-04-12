/* Exercise 9

Java Program to find volume of cylinder

*/

import java.util.Scanner;
import java.lang.Math;

public class VolumeCylinder {
    public static void main (String[] args){

        try (Scanner in = new Scanner(System.in)) {
            double volume;

            System.out.print("Enter the radius value: ");
            double radius = in.nextDouble();

            System.out.print("Enter the heigth value: ");
            double heigth = in.nextDouble();

            volume = Math.PI * Math.pow(radius, 2) * heigth;

            System.out.printf("The volume of Cylinder is: %.2f", volume);
        }




    }
}