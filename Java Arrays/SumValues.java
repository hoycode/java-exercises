/* Exercise 1
    Write a Java program to sum values of an array
*/

public class SumValues {

    public static void main(String[] args) {
        int myArray[] = { 10, 20, 30 };
        int sum = 0;

        for (int i : myArray) {
            sum += i;
        }

        System.out.println("The sum is above array is: " + sum);
    }

}
