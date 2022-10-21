/*

Write a function that accepts two parameters. The first parameter should be an array of
integers and the second parameter should be one integer value. The function should
include a logic which will print a pair of numbers from the given array whose addition is
equal to the second integer value param. It will not print anything if there does not exist
such a pair.
Example:
1st param: array[1, 2, -3, 4, 5], 2nd param: 2
Printed output: (-3, 5)

 */
package day5_weeklytest;
import java.util.*;

public class question1 {
    
    public static void main(String[] args) {

        int[]inputArray = {1,2,-3,4,5};

        int targetSum = 2;

        int lengthOfArray = inputArray.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<lengthOfArray;i++)
        {
            if(map.containsKey(targetSum-inputArray[i]))
            {
                System.out.print("Pair with sum equal to target sum is " + "{ " + inputArray[i] + " " + (targetSum-inputArray[i]) + " }");
                return;
            }
            else
            {
                map.put(inputArray[i],i);
            }
        }

        // System.out.print("Hello");
    }

}
