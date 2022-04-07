/* Exercise 12

Write a Java program to count the letters, spaces, numbers and other characters of an input string

*/

import java.util.Scanner;

public class CountInputString {
 public static void main (String[] args){

    String test = "@TechStudy.org 123456";
    count(test);

 }   

 public static void count(String x){
    char[] ch = x.toCharArray();
    int letter = 0;
    int space = 0;
    int num = 0;
    int otherchar = 0;

    for(int i = 0; i < x.length(); i++){
        if(Character.isLetter(ch[i])){
            letter ++;
        } else if (Character.isDigit(ch[i])){
            num ++;
        } else if (Character.isSpaceChar(ch[i])){
            space ++;
        } else {
            otherchar ++;
        }
    }

    System.out.println("Number os letters: " + letter);
    System.out.println("Number of spaces: " + space);
    System.out.println("Number of numbers: " + num);
    System.out.println("Number of other chars: " + otherchar);
 }
}
