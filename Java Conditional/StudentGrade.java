/* Exercise 16

Write a Java program that determines a student’s grade

if the average score >=90% =>Student grade = A

if the average score >= 70% and <90% =>Student grade = B

if the average score>=50% and <70% =>Student grade = C

if the average score<50% =>Student grade = F

*/

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double quizGrade, midGrade, finalGrade, avg = 0;

        System.out.print("Enter your quiz score: ");
        quizGrade = in.nextDouble();

        System.out.print("Enter your mid score: ");
        midGrade = in.nextDouble();

        System.out.print("Enter your final score: ");
        finalGrade = in.nextDouble();

        avg = (quizGrade + midGrade + finalGrade) / 3;

        if (avg >= 90) {
            System.out.printf("You grade is A (%.2f)", avg);
        } else if (avg >= 70 && avg < 90) {
            System.out.printf("You grade is B (%.2f)", avg);

        } else if (avg >= 50 && avg < 70) {
            System.out.printf("You grade is C (%.2f)", avg);
        } else
            System.out.printf("You grade is F (%.2f)", avg);

    }
}
