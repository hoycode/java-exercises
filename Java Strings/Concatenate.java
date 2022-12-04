/* Exercise 1
    Write a Java program to concatenate two string
*/
import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        String concat1, concat2;

        Scanner in = new Scanner (System.in);

        System.out.print("Enter the first string: ");
        concat1 = in.nextLine();

        
        System.out.print("Enter the second string: ");
        concat2 = in.nextLine();

        //Concatenate the 2 strings

        String aux = concat1.concat(concat2);

        System.out.println("Concatenated String: " + aux);

    }
}
