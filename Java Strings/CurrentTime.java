/* Exercise 8

Write a java program to print current date and time in the specified format

*/

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentTime {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance(); // Returns instance with current date and time set

        System.out.println("Date and Time:");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy | HH:mm:ss");
        System.out.println(formatter.format(calendar.getTime()));

    }
}
