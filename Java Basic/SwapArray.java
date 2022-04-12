import java.util.Arrays;

/*Exercise 21

Write a Java program to swap the first and last elements of an array and create a new array

*/

public class SwapArray {
    public static void main(String[] args){

        int[] array_nums = {10,20,30};
        int x = 0;

        System.out.println("Original Array: " + Arrays.toString(array_nums));

        x = array_nums[0]; //Index 0 of array_nums is stored in x

        array_nums[0] = array_nums[array_nums.length - 1]; //Index 0 of array_nums is stored in last Index (2)
        array_nums[array_nums.length - 1] = x;

        System.out.println("The new array is: " + Arrays.toString(array_nums));
    }
}
