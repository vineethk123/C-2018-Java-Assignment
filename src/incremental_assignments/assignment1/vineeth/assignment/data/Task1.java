package incremental_assignments.assignment1.vineeth.assignment.data;

public class Task1 {

    private int integer;
    private char character;

    // Prints the member variables
    public void printMembers() {
        // The code below will run without any errors because a default constructor is provided that initializes the
        // uninitialized member variables to their default values by Java.
        System.out.println("Task1: integer = " + integer);
        System.out.println("Task1: character = " + character);
    }

    // Prints two uninitialized local variables
    public void printLocalVariables() {
        int number;
        char myChar;

        /*
        The code below would throw an error because the local variables aren't initialized and Java provides no default
        mechanism for their initialization.
        System.out.println("Number: " + number);
        System.out.println("myChar: " + myChar);
        */
    }
}
