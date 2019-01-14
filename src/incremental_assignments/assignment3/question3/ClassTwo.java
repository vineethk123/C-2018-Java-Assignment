package incremental_assignments.assignment3.question3;

public class ClassTwo extends ClassOne implements InterfaceFour {

    public ClassTwo(String name) {
        super(name);
    }

    @Override
    public void methodThree() {
        System.out.println("Method Three Implemented");
    }

    @Override
    public void methodOne() {
        System.out.println("Method One Implemented");
    }

    @Override
    public void methodTwo() {
        System.out.println("Method Two Implemented");
    }
}
