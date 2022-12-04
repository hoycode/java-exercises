/*Exercise 5

Write a Java program to find the maximum and minimum value of an array

*/

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            int elements;

            System.out.print("Enter the number of elements of the array: ");

            if (in.hasNextInt()) {

                elements = in.nextInt();
                if (elements > 0) {
                    double arr[] = new double[elements];
                    for (int i = 0; i < elements; i++) {
                        System.out.printf("Enter a value for index %d: ", i);
                        double num = in.nextDouble();

                        arr[i] = num;
                    }
                    ArrayMinimum(arr);
                    ArrayMaximum(arr);
                } else
                    System.out.println("Please, enter a positive number!");

            } else
                System.out.println("Please, enter a number!");
        }

    }

    public static void ArrayMinimum(double arr[]) {

        double aux;
        aux = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (aux > arr[i]) {
                aux = arr[i];
            }
        }
        System.out.print("The minimum number of the array is: " + aux);
    }

    public static void ArrayMaximum(double arr[]) {
        double aux;
        aux = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (aux < arr[i]) {
                aux = arr[i];
            }
        }
        System.out.println("\nThe maximum number of the array is: " + aux);
    }
}
