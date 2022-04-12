/* Exercise 2

Java Program to find area of rectangle

*/

import java.util.Scanner;

public class AreaRectangle {
  
    public static void main (String[] args){

        try (Scanner in = new Scanner (System.in)) {
            System.out.print("Introduce the length: ");
            double length = in.nextDouble();

            System.out.print("Introduce the width: ");
            double width = in.nextDouble();

            double area = length * width;

            System.out.printf("Length - %.2f | Width - %.2f | Area - %.2f", length, width, area);
        }
    }
}
