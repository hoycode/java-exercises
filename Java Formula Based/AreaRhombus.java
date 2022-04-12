/* Exercise 5

Java Program to find area of rhombus

*/

import java.util.Scanner;

public class AreaRhombus{

    public static void main (String[] args){

        try (Scanner in = new Scanner (System.in)) {
            double area;

            System.out.print("Enter the 1st diagonal value: ");
            double d1 = in.nextDouble();

            System.out.print("Enter the 2nd diagonal value: ");
            double d2 = in.nextDouble();

            area = (d1 * d2) / 2;

            System.out.printf("The area of Rhombus is: %.2f", area);
        }




    }
}