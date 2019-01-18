package incremental_assignments.assignment6;

public class Assignment6 {

    public static void main(String args[]) {
        SList<Integer> numbers = new SList<>();
        SListIterator<Integer> numberIterator = numbers.iterator();
        //numberIterator.next();
        //numberIterator.printFullList();
        numberIterator.add(5);
        numberIterator.add(123);
        numberIterator.removeCurrentNode();
        numberIterator.printFullList();
    }
}
