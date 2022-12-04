/* Exercise 2

Write a Java program to find the index of an array element

*/

import java.util.Scanner;

public class ElementIndex {
    public static void main(String[] args) {
        int myArray[] = {10, 20, 30, 40};

        for(int i : myArray){
            System.out.print(i + " ");
        }

        Scanner in = new Scanner (System.in);
        System.out.print("\nEnter a number from the array list: ");
        int num = in.nextInt();

        System.out.println("Index of " + num + " : " + findIndex(myArray, num));


    }

    public static int findIndex(int arr[], int num){

        //Check if array is null
        if(arr == null){
            return -1;
        }

        //Find the length of array
        int len = arr.length;
        int i = 0;

        //transverse Array

        while(i < len){
            if(arr[i] == num){
                return i;
            } else{
                i += 1;
            }
        }
        return -1;
    }
}
