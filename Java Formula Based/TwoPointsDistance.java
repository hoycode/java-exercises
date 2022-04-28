/* Exercise 24

Java Pogram To Find Distance Between Two Points

*/

//Imports

import java.util.Scanner;
import java.lang.Math;

public class TwoPointsDistance {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            int x1, x2, y1, y2;
            double distance;

            System.out.print("Enter the value for x1: ");
            x1 = in.nextInt();

            System.out.print("Enter the value for y1: ");
            y1 = in.nextInt();

            System.out.print("Enter the value for x2: ");
            x2 = in.nextInt();

            System.out.print("Enter the value for y2: ");
            y2 = in.nextInt();

            distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

            System.out.printf("The distance between (%d, %d) and (%d, %d) is: %.3f", x1, y1, x2, y2, distance);
        }
    }
}
