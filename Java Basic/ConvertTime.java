/*Exercise 19

Write a Java program to convert seconds to hour, minute and seconds

*/

import java.util.Scanner;

public class ConvertTime {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter seconds: ");
        int seconds = in.nextInt();

        int a = seconds % 60;
        int b = seconds / 60;
        int c = b % 60;

        b = b / 60;
        System.out.print( b + ":" + c + ":" + a);
        System.out.print("\n");
    }
}
