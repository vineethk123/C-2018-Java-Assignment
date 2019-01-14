package incremental_assignments.assignment3.question2;

public class Main {

    public static void main(String args[]) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        for (Cycle cycle: cycles) {
            cycle.balance();
        }

        Unicycle unicycle = (Unicycle)cycles[0];
        Bicycle bicycle = (Bicycle)cycles[1];
        Tricycle tricycle = (Tricycle)cycles[2];

        unicycle.balance();
        bicycle.balance();
        tricycle.balance();
    }
}
