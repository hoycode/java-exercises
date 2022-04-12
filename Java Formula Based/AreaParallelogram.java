/* Exercise 6

Java Program to find area of parallelogram

*/

import java.util.Scanner;

public class AreaParallelogram{

    public static void main (String[] args){

        Scanner in = new Scanner (System.in);
        double area;
        
        System.out.print("Introduce the base value: ");
        double base = in.nextDouble();

        System.out.print("Enter the heigth value: ");
        double heigth = in.nextDouble();

        area = base * heigth;

        System.out.printf("The area of the parallelogram is: %.2f", area);
        

    }

}