/* Exercise 15

Java program to calculate average marks

*/


public class AverageMarks {

    public static void main(String[] args){

        int avg = 0, sum = 0;

        int[] marks = {80,70,60,50,40};

        for(int i = 0; i < marks.length; i++){
            sum += marks[i];
        }
        
        avg = sum / marks.length;

        System.out.printf("Marks: %d, %d, %d, %d, %d | Average: %d" , marks[0], marks[1], marks[2], marks[3], marks[4], avg);

    }

}
