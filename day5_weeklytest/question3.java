/*

    Write a function that accepts a stream of characters and prints the count of the last
    character appearing in a stream terminated with a ‘\n’. Remember that in a stream you
    don’t have any knowledge of the characters that are going to appear in the future. For
    simplicity consider the stream to be an array of characters.
    Example:
    Stream: [a, 1, !, r, r, , ~, A, r, ‘\n’]
    Note: The last character is ‘r’ and you’ll never know it unless you encounter ‘\n’ by
    actually iterating through the character array.
    Answer: 3 (total count of character `r` from the stream)

 */

package day5_weeklytest;
// import java.util.*;

public class question3 {
    
    public static void main(String[] args) {
        
        char[] inputArray = {'a','1','!','r','r',' ','~','A','r','\n'};

        int countOfCharacter = 0;

        if(inputArray[0] == '\n')
        {
            System.out.print("no character before \n in the array");
            return;
        }
        
        char countOfCharToBeFound = ' ';

        for(int i=0;i<inputArray.length;i++)
        {
            if(i>0 && inputArray[i] == '\n')
            {
                countOfCharToBeFound = inputArray[i-1];
            }
        }

        for(int i=0;i<inputArray.length;i++)
        {
            if(inputArray[i] == countOfCharToBeFound)
            {
                countOfCharacter++;
            }
        }

        System.out.print(countOfCharacter);

    }
}
