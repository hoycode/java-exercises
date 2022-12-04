/* Exercise 13

Write a java program to count total number of lines from a string

*/

public class StringLines {
    public static void main(String[] args) {
        String sample = "Hello\nWorld\nThis\nIs";
        System.out.println(sample);
        System.out.println("Total number of lines: " + countLines(sample));
    }

    private static int countLines(String str) {
        String[] lines = str.split("\r\n|\r|\n");
        return lines.length;
    }
}
