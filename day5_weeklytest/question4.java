/*
    Write a function that accepts an expression and checks for balanced parentheses in an
    expression. You should ignore the operands and operators. The function should print
    true in case of balanced parentheses, false otherwise.

    For simplicity, you can assume that each value from an expression is added into an
    array of characters and your function should accept this array of chars.
    Example#1: array( `(`, `2`, `+`, ` [`, ` (` , `{`, `*`, `4`, `{`, `}`, `3`, `}` `/`, `)` `]` `)` )
    Printed output: true
    As this has balanced parentheses ( [ ( { { } } ) ] )
    Example#2: array( `2`, `+`, ` (` , `{`, `*`, `4`, `{`, `}`, `3`, `[` `]` `}` `/`, `)` `]` `)`)
    Printed output: false
    As this has unbalanced parentheses ( { { } [ ] } ) ] )
 */
package day5_weeklytest;

import java.util.*;

public class question4 {
    
    public static void main(String[] args) {
        
        int[] inputArray = {'(','2','+','[','(','{','*','4','{','}','3','}','/',')',']',')'};

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<inputArray.length;i++)
        {

            if(inputArray[i] == '(' || inputArray[i] == '[' || inputArray[i] == '{')
            {
                stack.push((char) inputArray[i]);
            }
            else if(!stack.isEmpty() && stack.peek() == '(' && inputArray[i] == ')')
            {
                stack.pop();
            }
            else if(!stack.isEmpty() && stack.peek() == '[' && inputArray[i] == ']')
            {
                stack.pop();
            }
            else if(!stack.isEmpty() && stack.peek() == '{' && inputArray[i] == '}')
            {
                stack.pop();
            }
            
        }

        // at last of iteration is stack is empty then we can be sure that brackets are balanced

        if(stack.isEmpty())
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
        

    }

}
