package incremental_assignments.assignment3.question3;

public class Main {

    static void mainMethodOne(InterfaceOne interfaceOne) {
        System.out.println("InterfaceOne has access to methodOne() and methodTwo()");
        interfaceOne.methodOne();
        interfaceOne.methodTwo();
    }

    static void mainMethodTwo(InterfaceTwo interfaceTwo) {
        System.out.println("InterfaceTwo has access to methodOne() and methodTwo()");
        interfaceTwo.methodOne();
        interfaceTwo.methodTwo();
    }

    static void mainMethodThree(InterfaceThree interfaceThree) {
        System.out.println("InterfaceThree has access to methodOne() and methodTwo()");
        interfaceThree.methodOne();
        interfaceThree.methodTwo();
    }

    static void mainMethodFour(InterfaceFour interfaceFour) {
        System.out.println("InterfaceFour has access to methodOne(), methodTwo() & methodThree()");
        interfaceFour.methodOne();
        interfaceFour.methodTwo();
        interfaceFour.methodThree();
    }

    public static void main(String args[]) {
        ClassTwo classTwo = new ClassTwo("My Class");
        System.out.println("Using InterfaceOne:");
        mainMethodOne(classTwo);
        System.out.println("\nUsing InterfaceTwo:");
        mainMethodTwo(classTwo);
        System.out.println("\nUsing InterfaceThree:");
        mainMethodThree(classTwo);
        System.out.println("\nUsing InterfaceFour:");
        mainMethodFour(classTwo);
    }
}
