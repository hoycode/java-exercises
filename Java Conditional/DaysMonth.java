/* Exercise 2

Write a Java program to find the number of days in a month

Lap Year Formula (Used to calculate number of days in February depending on user input for year variable)

The year is multiple of 400.
The year is multiple of 4 and not multiple of 100.

year % 400 == 0
||
year % 4 == 0 && year % 100 != 0

if this condition is applied then February have 29, if not 28

*/

import java.util.Scanner;

public class DaysMonth {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String monthName = "";
        int numberOfDays = 0;

        System.out.print("Enter a month number: ");
        int month = in.nextInt();

        System.out.print("Enter a year: ");
        int year = in.nextInt();

        switch (month) {
            // Case January
            case 1:
                monthName = "January";
                numberOfDays = 31;
                break;

            // Case February
            case 2:
                monthName = "February";
                if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {

                    numberOfDays = 29;

                } else {
                    numberOfDays = 28;
                }
                break;

            // Case March
            case 3:
                monthName = "March";
                numberOfDays = 31;
                break;

            // Case April
            case 4:
                monthName = "April";
                numberOfDays = 30;
                break;

            // Case May
            case 5:
                monthName = "May";
                numberOfDays = 31;
                break;

            // Case June
            case 6:
                monthName = "June";
                numberOfDays = 30;
                break;

            // Case July
            case 7:
                monthName = "July";
                numberOfDays = 31;
                break;

            // Case August
            case 8:
                monthName = "August";
                numberOfDays = 31;
                break;

            // Case September
            case 9:
                monthName = "September";
                numberOfDays = 30;
                break;

            // Case October
            case 10:
                monthName = "October";
                numberOfDays = 31;
                break;

            // Case November
            case 11:
                monthName = "November";
                numberOfDays = 30;
                break;

            // Case December
            case 12:
                monthName = "December";
                numberOfDays = 31;
                break;

        }

        System.out.print(monthName + " " + year + " has " + numberOfDays + " days\n");

    }
}
