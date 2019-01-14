package incremental_assignments.assignment1.vineeth.assignment.singleton;

public class Task2 {

    private String sentence;

    public static Task2 createTask2(String words) {
         /*
         The member variable 'sentence' of the class isn't accessible inside the static method createTask2. This
         constraint is set because static methods can be called without creating any instance of the class which
         means the member variables might not have been created when the static method is called.
         sentence = words;
          */
         return new Task2();
    }

    // Prints the member variable "sentence"
    public void printSentence() {
        System.out.println("Task2: sentence = " + this.sentence);
    }
}
