public class ReverseLinkedListIndex {

    public static void main(String[] args) {

        Node node1 = new Node("a");
        Node node2 = new Node("b");
        Node node3 = new Node("c");
        Node node4 = new Node("d");
        Node node5 = new Node("e");
        Node node6 = new Node("f");

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);

        printList(node1);

        reverseList(node1);
        node1.setNext(null);

        System.out.println("\n");
        printList(node6);
    }

    private static void reverseList(Node node) {

        if (node.getNext() == null) {
            return;
        }

        reverseList(node.getNext());

        node.getNext().setNext(node);
    }


    private static void printList(Node node) {

        if (node.getNext() == null) {
            System.out.print(node.getData());
            return;
        }

        System.out.print(node.getData() + ", ");
        printList(node.getNext());
    }
}

class Node {

    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}