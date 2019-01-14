package incremental_assignments.assignment3.assignment4;

public class Unicycle implements Cycle {

    private String name;
    private double speed;

    public Unicycle(String name) {
        this.name = name;
    }

    @Override
    public void pedal() {
        System.out.println("Pedalling unicycle");
        this.speed += 3;
    }

    @Override
    public void horn() {
        System.out.println("Please move Unicycle is coming");
    }
}
