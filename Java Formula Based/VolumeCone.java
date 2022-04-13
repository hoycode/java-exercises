/* Exercise 11

Java Program to find volume of cone

*/

import java.util.Scanner;

public class VolumeCone {
    public static void main (String[] args){

        try (Scanner in = new Scanner(System.in)) {
            double volume;

            System.out.print("Enter the radius value: ");
            double radius = in.nextDouble();

            System.out.print("Enter the heigth value: ");
            double heigth = in.nextDouble();

            volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * heigth;

            System.out.printf("The volume of Sphere is: %.2f", volume);
        }
    }
    
}
