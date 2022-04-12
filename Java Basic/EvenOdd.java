import java.util.Arrays;

/*Exercise 22

Write a Java program to count the number of even and odd elements in a given array

*/

//import java.util.*;

public class EvenOdd {
    
    public static void main (String[] args){

        int count_odd = 0, count_even = 0;

        int[] array_nums = {1,2,3,4,5,6,7,8,9,10};
    
        System.out.println("Original Array: " + Arrays.toString(array_nums));
    
        for(int i = 0; i < array_nums.length; i++){
            if(array_nums[i] % 2 == 0){
                count_even++;
            }else{
                count_odd++;
            }
        }

        System.out.println("Even numbers count: " + count_even);
        System.out.println("Odd numbers count: " + count_odd);
    }
}
