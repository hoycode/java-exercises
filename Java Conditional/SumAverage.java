/* Exercise 6

Write a Java program to input 5 numbers from keyboard and find their sum and average

*/

import java.util.Scanner;

public class SumAverage {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        double num, sum = 0, avg = 0;
        int count;

        for(count = 0; count < 5; count ++){
            System.out.print("Enter a number: ");
            num = in.nextInt();
            sum += num;
        }

        avg = sum/count;

        System.out.println("The total sum is " + sum);
        System.out.println("The average is " + avg);

    }
}
