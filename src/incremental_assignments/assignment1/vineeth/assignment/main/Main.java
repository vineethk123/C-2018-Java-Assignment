package incremental_assignments.assignment1.vineeth.assignment.main;


import incremental_assignments.assignment1.vineeth.assignment.data.Task1;
import incremental_assignments.assignment1.vineeth.assignment.singleton.Task2;

public class Main {

    public static void main(String args[]) {
        Task1 task1 = new Task1();
        task1.printMembers();
        task1.printLocalVariables();


        Task2 task2 = Task2.createTask2("Task2 Instance");
        task2.printSentence();
    }
}
