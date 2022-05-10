/* Exercise 4

Write a Java Program to accept number of week’s day (1-7) and print name of the day

*/

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String weekDayString = "";

        System.out.print("Enter a number between 1-7: ");
        int weekDay = in.nextInt();

        switch (weekDay) {
            case 1:
                weekDayString = "Monday";
                break;

            case 2:
                weekDayString = "Tuesday";
                break;

            case 3:
                weekDayString = "Wednesday";
                break;

            case 4:
                weekDayString = "Thursday";
                break;

            case 5:
                weekDayString = "Friday";
                break;

            case 6:
                weekDayString = "Saturday";
                break;

            case 7:
                weekDayString = "Sunday";
                break;
            default:
                System.out.println("Enter a number between 1 and 7!");
        }

        if(weekDay >= 1 && weekDay <= 7)
            System.out.printf("The day %d is %s", weekDay, weekDayString);
    }
}
