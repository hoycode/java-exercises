/*Exercise 10

Write a Java program and compute the sum of the digits of an integer.

*/

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);

        System.out.print("Enter an Integer: ");
        long n = in.nextLong();

        System.out.println("The sum of the digits is: " + Sum(n));
        
        
    }

    
public static int Sum (long num){
    int sum = 0;
    while(num != 0){
        sum += num % 10;
        num /= 10;
    }
    return sum;
}
}
