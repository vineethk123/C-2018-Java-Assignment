package incremental_assignments.assignment2.question2;

class Question2 {

    private long number;
    private String name;

    Question2() {
        // Calling an overloaded constructor
        this(1000000L, "Question2");
        System.out.println("In First Constructor.");
    }

    private Question2(long number, String name) {
        this.number = number;
        System.out.println("In Second Constructor");
    }
}
