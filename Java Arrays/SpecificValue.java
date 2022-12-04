/* Exercise 4

Write a Java program to test if an array contains a specific value

*/

import java.util.Scanner;

public class SpecificValue {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the number of values: ");

        if (in.hasNextInt()) {
            int n = in.nextInt();

            if (n > 0) {
                int arr[] = new int[n];

                populateArray(arr);

                System.out.print("Enter a number to check if exists inside the array: ");
                int checkNum = in.nextInt();

                for (int i = 0; i < arr.length; i++) {
                    if (checkNum == arr[i]) {
                        System.out.println("The number exists on index: " + i);
                    } else{
                        System.out.println("The number doesn't exist");
                        return;
                    }


                }

            } else
                System.out.println("Introduce a positive number!");
        } else
            System.out.println("Introduce a number please!");
    }

    public static void populateArray(int arr[]) {
        int len = arr.length;

        for (int j = 0; j < len; j++) {
            System.out.print("Enter a number for index " + j + ": ");

            if (in.hasNextInt()) {
                int input = in.nextInt();
                arr[j] = input;
            } else
                System.out.println("Enter a number value!");

            // System.out.println(arr[j]);
        }
    }
}
