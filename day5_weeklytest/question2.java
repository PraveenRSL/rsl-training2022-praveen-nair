/*
    Write a function that accepts an array of integers and prints maximum pair product from
    the given array.
    Note: maximum pair product means the product of any 2 numbers from that array.
    Example:
    Param: array[-15, -20, 1, 2, -30, 30]
    Printed output: 600
    Here 600 is the maximum achievable multiplication product for any 2 numbers of this
    array.
 */

package day5_weeklytest;
import java.util.*;

public class question2 {
    
    public static void main(String[] args) {

        int[]inputArray = {-15,-20,1,2,-30,30};

        int maxProductOfTwoNumbers = Integer.MIN_VALUE;

        int lengthOfArray = inputArray.length;

        Arrays.sort(inputArray);

        int product_1 = inputArray[0] * inputArray[1];

        int product_2 = inputArray[lengthOfArray-1] * inputArray[lengthOfArray-2];

        if(product_1 > product_2)
        {
            maxProductOfTwoNumbers = product_1;
        }
        else
        {
            maxProductOfTwoNumbers = product_2;
        }

        System.out.print(maxProductOfTwoNumbers);
    }

}
