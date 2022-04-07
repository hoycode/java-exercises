/* Exercise 14

Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn

*/

import java.util.Scanner;

public class ComputeValue {
    public static void main (String[] args){
        
        Scanner in = new Scanner (System.in);

        System.out.print("Introduce a number: ");
        int num = in.nextInt();

        System.out.printf("%d + %d%d + %d%d%d", num, num, num, num, num, num);
    }
}
