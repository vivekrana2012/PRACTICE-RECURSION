public class ReverseLinkedListIndex {

    public static void main(String[] args) {

        LinkedListNode node1 = new LinkedListNode("a");
        LinkedListNode node2 = new LinkedListNode("b");
        LinkedListNode node3 = new LinkedListNode("c");
        LinkedListNode node4 = new LinkedListNode("d");
        LinkedListNode node5 = new LinkedListNode("e");
        LinkedListNode node6 = new LinkedListNode("f");

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

    private static void reverseList(LinkedListNode node) {

        if (node.getNext() == null) {
            return;
        }

        reverseList(node.getNext());

        node.getNext().setNext(node);
    }


    private static void printList(LinkedListNode node) {

        if (node.getNext() == null) {
            System.out.print(node.getData());
            return;
        }

        System.out.print(node.getData() + ", ");
        printList(node.getNext());
    }
}

class LinkedListNode implements Node {

    private String data;
    private LinkedListNode next;

    public LinkedListNode(String data) {
        this.data = data;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public LinkedListNode getNext() {
        return next;
    }
}