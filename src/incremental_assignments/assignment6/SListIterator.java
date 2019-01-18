package incremental_assignments.assignment6;

public class SListIterator<E> {

    private Node head;
    private Node currentNode;

    public SListIterator() {
    }

    public Node next() {
        if (head == null) {
            System.out.println("List is Empty. So, next node is not available.");
            return null;
        }
        else {
            Node nextNode = currentNode.getNextNode();
            if (nextNode != null) {
                currentNode = nextNode;
                return currentNode;
            }
            else {
                System.out.println("Reached the end of the list.  So, next node is not available.");
                return null;
            }
        }
    }

    public void add(E content) {
        Node newNode = new Node(content);
        if (head == null) {
            head = newNode;
            currentNode = newNode;
        }
        else {
            currentNode.setNextNode(newNode);
            currentNode = newNode;
        }
    }

    public void rewind() {
        currentNode = head;
    }

    public void printFullList() {
        if (head == null) {
            System.out.println("List is Empty. Nothing to print");
        }
        else {
            currentNode = head;
            while (currentNode != null) {
                System.out.println(currentNode.getContent());
                currentNode = currentNode.getNextNode();
            }
        }
    }

    public void removeCurrentNode() {
        if (head == null) {
            System.out.println("List is empty. Nothing to remove.");
        }
        else if (currentNode == head) {
            System.out.println("Removed: " + currentNode.getContent());
            head = null;
            currentNode = null;
        }
        else {
            System.out.println("Removed: " + currentNode.getContent());
            Node node = head;
            while (node.getNextNode() != currentNode) {
                node = node.getNextNode();
            }
            node.setNextNode(null);
            currentNode = node;
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getCurrentNode() {
        return currentNode;
    }
}
