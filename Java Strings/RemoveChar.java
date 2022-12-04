/* Exercise 10

    Write a java program to remove a particular character from a string

*/

import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = in.nextLine();

        System.out.print("Enter the character index you want to remove: ");
        int index = in.nextInt();

        System.out.println(removeCharAt(input, index));

    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);

    }
}
