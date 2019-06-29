/*
 * PalindromeTester.java
 *
 * Richard Kaune T00641439
 * COMP 2231_SW2 Assignment 2 Question 4
 * This is an application using both a stack and a queue to test whether a given string is a palindrome.
 */
package jsjf;

import java.util.Scanner;

/**
 *
 * @author richardkaune
 */
public class PalindromeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // instantiate LinkedStack and LinkedQueStack objects
        LinkedStack<Character> stack = new LinkedStack<Character>();
        LinkedQueue<Character> queue = new LinkedQueue<Character>();
        
        // instantiate Scanner object
        Scanner input = new Scanner(System.in);
        String str;
        Character ch;
        int i;
        
        // get a string from the user
        System.out.print("Enter a string to check for palindrome: ");
        str = input.next();
        
        
        // put string into stack and queue
        i = 0;
        while (i< str.length())
        {
            // get character from the user entered string
            ch=str.charAt(i);
            
            // insert this character into the stack
            stack.push(ch);
            
            // insert this character into the queue
            queue.enqueue(ch);
            
            i++;
        }
        
        // call to the palindrome method
        boolean result = palindrome(stack,queue);
        
        // display if user supplied string is palindrome or not
        if (result)
            System.out.println("The string " + str + " is a palindrome");
        else
            System.out.println("The string " + str + " is not a palindrome");
    }
    /**
     * Checks the supplied stack and queue for equivalence and hence if the supplied user string is a palindrome
     * @param stack containing the user supplied string
     * @param queue containing the user supplied string
     * @return boolean value if the palindrome is true or not
     */
    public static boolean palindrome (LinkedStack<Character> stack, LinkedQueue<Character> queue)
    {
        while(!stack.isEmpty())
        {
            if (stack.pop() != queue.dequeue())
                return false;
                        
        }
        return true;
    }
    
}
