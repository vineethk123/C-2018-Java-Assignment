package assignment2;

import java.util.Scanner;


public class Assignment2 {

    /**
     * @param args
     * Time Complexity: O(n) as the stream filters use iteration internally
     * Space Complexity: O(1)
     */
    public static void main(String args[]) {
        String input;
        long distinctCount;

        // Prompt user for an input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        input = scanner.nextLine();    // Get the input from the console

        distinctCount = input.toLowerCase().chars()    // Returns a stream of lower-cased input's characters
                .filter(ch -> ch >='a' && ch <= 'z')   // Returns a stream of english alphabet only
                .distinct()                            // Returns a stream of distinct elements
                .count();                              // Returns a count of elements in the stream

        if (distinctCount == 26) {
            System.out.println("The given input contains all 26 alphabets.");
        }
        else {
            System.out.println("The given input doesn't contain all alphabets.");
        }
    }
}
