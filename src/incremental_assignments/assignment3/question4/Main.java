package incremental_assignments.assignment3.question4;

public class Main {

    public static void main(String args[]) {
        Unicycle unicycle = UnicycleFactory.createUnicycle("My Unicycle");
        unicycle.pedal();
        unicycle.horn();

        Bicycle bicycle = BicycleFactory.createBicycle("My Bicycle");
        bicycle.pedal();
        bicycle.horn();

        Tricycle tricycle = TricycleFactory.createTricycle("My Tricycle");
        tricycle.pedal();
        tricycle.horn();

    }
}
