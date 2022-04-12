/* Exercise 8

Java Program to find volume of sphere

*/

import java.util.Scanner;
import java.lang.Math;

public class VolumeSphere {
    public static void main(String[] args){

        try (Scanner in = new Scanner (System.in)) {
            double volume;

            System.out.print("Enter the radius value: ");
            double radius = in.nextDouble();

            volume =  (Math.PI * Math.pow(radius, 3)) * (4.0/3.0);

            System.out.printf("The volume of Sphere is: %.2f", volume);
        }



    }
}
