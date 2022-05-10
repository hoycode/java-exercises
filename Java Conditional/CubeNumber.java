/* Exercise 9

Write a Java program to display the cube of the number upto given an integer
  
 */

 import java.util.Scanner;

public class CubeNumber {

    public static void main(String[] args){
        Scanner in = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        for(int i = 1; i <= num; i++){
            int cube = i * i * i;
            System.out.println("Cube of " + i + ": " + cube);
        }
    }
    
}
