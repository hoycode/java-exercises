/*Exercise 10

Java Program to find Volume Of cuboid

*/

import java.util.Scanner;

public class VolumeCuboid {
    public static void main (String[] args){

        try (Scanner in = new Scanner(System.in)) {
            double volume;

            System.out.print("Enter the length value: ");
            double length = in.nextDouble();

            System.out.print("Enter the width value: ");
            double width = in.nextDouble();

            System.out.print("Enter the heigth value: ");
            double heigth = in.nextDouble();

            volume = length * width * heigth;

            System.out.printf("The volume of Cuboid is: %.2f", volume);

        }
    }
}
