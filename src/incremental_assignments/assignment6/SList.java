package incremental_assignments.assignment6;

public class SList<E> {

    private static int iteratorCount;
    private static SListIterator listIterator;

    public static SListIterator iterator() {
        if (iteratorCount == 0) {
            listIterator = new SListIterator();
            return listIterator;
        }
        else {
            return listIterator;
        }
    }

    @Override
    public String toString() {
        if (listIterator == null) {
            return "Empty List";
        }
        else {
            String listContents = "List:\n";
            Node currentNode = listIterator.getHead();
            while (currentNode != null) {
                listContents += currentNode.getContent();
                currentNode = currentNode.getNextNode();
            }
            return listContents;
        }
    }

}
