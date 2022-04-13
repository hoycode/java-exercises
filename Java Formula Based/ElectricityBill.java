/* Exercise 19

Java Program to calculate electricity bill

*/

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args){

        double billpay = 0;
        int units;
        double unitPrice = 0;

        try (Scanner in = new Scanner (System.in)) {

            System.out.print("Enter your power consupmation (kWh - units): ");
            units = in.nextInt();

            System.out.print("Enter unite price (kWh): ");
            unitPrice = in.nextDouble();
        }

        billpay = units * unitPrice;
        billpay = billpay + (billpay * (23.0/100.0));

        System.out.printf("You electricity bill is %.2f", billpay);


    }
    
}
