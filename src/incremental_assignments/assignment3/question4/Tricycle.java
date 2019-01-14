package incremental_assignments.assignment3.question4;

public class Tricycle implements Cycle {

    private String name;
    private double speed;

    public Tricycle(String name) {
        this.name = name;
    }

    @Override
    public void pedal() {
        System.out.println("Pedalling tricycle");
        this.speed += 1.5;
    }

    @Override
    public void horn() {
        System.out.println("Please move Tricycle is coming");
    }
}
