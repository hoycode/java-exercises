/* Exercise 10

Java program to calculate average marks

*/

import java.util.Scanner;

public class CalculateAvgMarks {
    public static void main(String[] args){
        int n = 5;
        double avg = 0;

        double marks[] = new double[n];
        Scanner in = new Scanner (System.in);

        for(int i = 0; i < n; i++){
            System.out.print("Enter a grade: ");
            double mark = in.nextDouble();
            marks[i] = mark;

            avg = avg + marks[i];
        }

        System.out.printf("The average of (%.2f, %.2f, %.2f, %.2f, %.2f) is %.2f", marks[0], marks[1], marks[2], marks[3],marks[4], avg/n);
    }
}
