
public class BinarySearchTreeInsertionIndex {

    public static void main(String[] args) {

        BinarySearchTreeNode node1 = new BinarySearchTreeNode(15);
        BinarySearchTreeNode node2 = new BinarySearchTreeNode(22);
        BinarySearchTreeNode node3 = new BinarySearchTreeNode(30);
        BinarySearchTreeNode node4 = new BinarySearchTreeNode(43);
        BinarySearchTreeNode node5 = new BinarySearchTreeNode(57);
        BinarySearchTreeNode node6 = new BinarySearchTreeNode(68);

        node4.setLeft(node2);
        node4.setRight(node5);

        node2.setLeft(node1);
        node2.setRight(node3);

        node5.setRight(node6);

        printTree(node4);

        //          43
        //      22      57
        //  15      30      68
        //      25
        insertNode(node4, new BinarySearchTreeNode(25));

        System.out.println("\n");
        printTree(node4);
    }

    private static void printTree(BinarySearchTreeNode node) {

        System.out.print(node.getData() + ", ");

        if (node.getLeft() == null && node.getRight() == null) {
            return;
        }

        if (node.getLeft() != null)
            printTree(node.getLeft());

        if (node.getRight() != null)
            printTree(node.getRight());
    }

    private static void insertNode(BinarySearchTreeNode node, BinarySearchTreeNode binarySearchTreeNode) {

        if (node.getData() == binarySearchTreeNode.getData()) {
            return;
        }

        if (node.getData() > binarySearchTreeNode.getData()) {
            if (node.getLeft() == null) {
                node.setLeft(binarySearchTreeNode);
            } else {
                insertNode(node.getLeft(), binarySearchTreeNode);
            }
        } else {
            if (node.getRight() == null) {
                node.setRight(binarySearchTreeNode);
            } else {
                insertNode(node.getRight(), binarySearchTreeNode);
            }
        }
    }
}

class BinarySearchTreeNode implements Node {

    private int data;
    private BinarySearchTreeNode left;
    private BinarySearchTreeNode right;

    public BinarySearchTreeNode(int data) {
        this.data = data;
    }

    public void setLeft(BinarySearchTreeNode left) {
        this.left = left;
    }

    public void setRight(BinarySearchTreeNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public BinarySearchTreeNode getLeft() {
        return left;
    }

    public BinarySearchTreeNode getRight() {
        return right;
    }
}