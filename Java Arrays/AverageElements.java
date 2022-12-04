/* Exercise 3

Write a Java program to calculate the average value of array elements

*/

import java.util.Scanner;

public class AverageElements {
    public static void main (String[] args){

        double avg = 0;
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of elements of the array: ");

        if(in.hasNextInt()) {
            int n = in.nextInt();

            if(n > 0){
                int arr[] = new int[n];

                for(int i = 0; i < n; i++){
                    System.out.printf("Enter the value for index %d: ", i);

                    if(in.hasNextInt()){
                        int indexValue = in.nextInt();
                        arr[i] = indexValue;

                    } else 
                        System.out.println("Enter a number please!");
                }

                for(int j = 0; j < n; j++){
                    avg += arr[j];
                }
                avg /= n;
                System.out.println("The average is: " + avg);

            } else if (n < 0){
                System.out.println("Enter a positive number please!");
            } else
                System.out.println("The entered value is not a number!");
        } else
            System.out.println("The entered value is not a number!");
    
    } 
}
