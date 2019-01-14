package incremental_assignments.assignment3.question1;

public class Main {

    public static void main(String args[]) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();

        for (Rodent rodent: rodents) {
            System.out.println(rodent.getClass() + ":");
            rodent.makeSound();
            rodent.tailSize();
            System.out.println();
        }
    }
}
