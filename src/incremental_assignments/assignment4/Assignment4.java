package incremental_assignments.assignment4;

import java.util.Scanner;

public class Assignment4 {

    public static void main(String args[]) {
        int choice;
        ExceptionThrower thrower = new ExceptionThrower();
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter a number: ");
            choice = scanner.nextInt();
            thrower.throwException(choice);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally Executed");
        }
    }
}
