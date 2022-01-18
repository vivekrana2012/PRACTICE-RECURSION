public class MergeSortedLinkedListIndex {

    public static void main(String[] args) {

        LinkedListNode node1 = new LinkedListNode("a");
        LinkedListNode node2 = new LinkedListNode("c");
        LinkedListNode node3 = new LinkedListNode("e");
        LinkedListNode node4 = new LinkedListNode("g");
        LinkedListNode node5 = new LinkedListNode("i");
        LinkedListNode node6 = new LinkedListNode("k");

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);

        LinkedListNode node7 = new LinkedListNode("b");
        LinkedListNode node8 = new LinkedListNode("d");
        LinkedListNode node9 = new LinkedListNode("f");
        LinkedListNode node10 = new LinkedListNode("h");
        LinkedListNode node11 = new LinkedListNode("j");
        LinkedListNode node12 = new LinkedListNode("l");

        node7.setNext(node8);
        node8.setNext(node9);
        node9.setNext(node10);
        node10.setNext(node11);
        node11.setNext(node12);

        merge(node1, node7);
    }

    private static void merge(LinkedListNode nodeLL1, LinkedListNode nodeLL2) {

        if (nodeLL1.getData().compareTo(nodeLL2.getData()) > 0) {
            
        }
    }
}
