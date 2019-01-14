package incremental_assignments.assignment3.question1;

public class Gerbil extends Rodent {

    public Gerbil() {
        System.out.println("Gerbil Class");
    }

    @Override
    public void makeSound() {
        System.out.println("Gerbil Chirp");
    }

    @Override
    public void tailSize() {
        System.out.println("8cm");
    }
}
