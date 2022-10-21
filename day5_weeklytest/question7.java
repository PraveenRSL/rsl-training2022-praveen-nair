/*

    Write a function that accepts an array of integers and prints the first-maximum difference
    between any two elements from an array.
    Example:
    int arr[]={14, 12, 70, 15, 95, 65, 22, 30};
    First max-difference = 95 -12 = 83

 */
package day5_weeklytest;

public class question7 {

    public static void main(String[] args) {
        
        int[]inputArray = {14, 12, 70, 15, 95, 65, 22, 30};

        int maxDifference = inputArray[1]-inputArray[0];

        int minElement = inputArray[0];

        for(int i=1;i<inputArray.length;i++)
        {

            if(inputArray[i] - minElement > maxDifference )
            {
                maxDifference = inputArray[i]-minElement;
            }
            
            if(inputArray[i] < minElement)
            {
                minElement = inputArray[i];
            }

        }

        System.out.print(maxDifference);

    }
    
}
