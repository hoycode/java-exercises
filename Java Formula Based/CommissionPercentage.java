/* Exercise 23

Java Pogram to Calculate Commission Percentage

*/

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args){

        try (Scanner in = new Scanner(System.in)) {
            double totalProfit, commissionRate, commissionFinal;

            System.out.print("Enter the total profit amount: ");
            totalProfit = in.nextDouble();

            System.out.print("Enter the commission rate: ");
            commissionRate = in.nextDouble();

            commissionFinal = totalProfit * (commissionRate / 100);

            System.out.println("Comission Amount: " + commissionFinal);

        }
    }
}
