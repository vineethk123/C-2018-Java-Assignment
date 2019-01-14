package incremental_assignments.assignment3.question4;

public class Bicycle implements Cycle {

    private String name;
    private double speed;

    public Bicycle(String name) {
        this.name = name;
    }

    @Override
    public void pedal() {
        System.out.println("Pedalling bicycle");
        this.speed += 7;
    }

    @Override
    public void horn() {
        System.out.println("Please move Bicycle is coming");
    }
}
