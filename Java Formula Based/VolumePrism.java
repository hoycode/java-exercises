/* Exercise 7

Java Program to find volume of Prism

*/

import java.util.Scanner;

public class VolumePrism {

    public static void main (String[] args){

        try (Scanner in = new Scanner(System.in)) {
            double volume;

            System.out.print("Introduce the base value: ");
            double base = in.nextDouble();

            System.out.print("Introduce the heigth value: ");
            double heigth = in.nextDouble();

            volume = base * heigth;

            System.out.printf("The volume of Prism is: %.2f", volume);
        }
    }
    
}
