/* Exercise 12

Write a java program to remove html tags from a string

*/

public class RemoveTags {
    public static void main (String[] args){

        String tag = "<p>No 'p' tag allowed</p>";
        System.out.println(tag);

        String noTag = tag.replaceAll("<[^>]*>", "");

        System.out.println(noTag);

    }
}
