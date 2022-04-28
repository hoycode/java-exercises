/* Exercise 22

Java Program To Calculate Batting Average

*/

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {

        double totalRuns, atBats;
        double avg;

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter your total runs: ");
            totalRuns = in.nextDouble();

            System.out.print("Enter your At-Bats: ");
            atBats = in.nextDouble();
        }

        avg = totalRuns / (atBats);

        System.out.printf("Your batting average is %.2f", avg);

    }
}