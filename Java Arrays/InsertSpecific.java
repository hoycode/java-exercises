/* Exercise 6

Write a Java program to insert an element (specific position) into an array

*/

import java.util.Arrays;
import java.util.Scanner;

public class InsertSpecific {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        int newValue, idxPosition;

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the new value: ");

            if (in.hasNextInt()) {
                newValue = in.nextInt();
                System.out.print("Enter the index value: ");
                if (in.hasNextInt()) {
                    idxPosition = in.nextInt();
                    System.out.println("Original Array: " + Arrays.toString(arr));

                } else
                    System.out.println("The entered value is not a number!");
            } else
                System.out.println("The entered value is not a number!");
        }
    }
}
