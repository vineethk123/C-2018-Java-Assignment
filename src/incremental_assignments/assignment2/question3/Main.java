package incremental_assignments.assignment2.question3;

public class Main {

    public static void main(String[] args) {
        Question3[] question3 = new Question3[5];

        // Creating 5 objects
        // Solution to Question 4
        for (int index=0; index < 5; index++) {
            question3[index] = new Question3("Object " + index);
        }
    }
}
