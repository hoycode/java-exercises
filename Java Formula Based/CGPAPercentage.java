/* Exercise 20

Java Program To Calculate CGPA Percentage

*/

import java.util.Scanner;

public class CGPAPercentage {
    public static void main (String[] args){

        double cgpa, cgpaPercentage, sum = 0;

        int[] grades = new int[5];

        try (Scanner in = new Scanner (System.in)) {
            for(int i = 0; i < grades.length; i++){
                System.out.print("Enter grade: ");
                grades[i] = in.nextInt();

                sum += grades[i];
            }
        }

        cgpa = (sum / grades.length) / 10;
        cgpaPercentage = cgpa * 9.5;

        System.out.println("\nCGPA: " + cgpa);
        System.out.println("Percentage from CGPA: " + cgpaPercentage);
    }
}
