package incremental_assignments.assignment3.question1;

public class Mouse extends Rodent {

    public Mouse() {
        System.out.println("Mouse Class");
    }

    @Override
    public void makeSound() {
        System.out.println("squeak");
    }

    @Override
    public void tailSize() {
        System.out.println("8cm");
    }
}
