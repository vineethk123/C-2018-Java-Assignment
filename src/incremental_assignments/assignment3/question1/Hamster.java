package incremental_assignments.assignment3.question1;

public class Hamster extends Rodent {

    public Hamster() {
        System.out.println("Hamster Class");
    }

    @Override
    public void makeSound() {
        System.out.println("Hamster chirp");
    }

    @Override
    public void tailSize() {
        System.out.println("2cm");
    }
}
