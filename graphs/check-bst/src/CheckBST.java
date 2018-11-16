/**
 * Created by akash on 20/9/18.
 */
public class CheckBST {

    public static void main(String args[]) {
        Node goodBinaryTree = new Node();
        goodBinaryTree.initialiseDefaults();
        Node badBinaryTree = new Node();
        badBinaryTree.initialiseDefaultsBadCase();
    }

    private static class Node {

        private int data;
        private Node leftNode;
        private Node rightNode;

        Node() {
        }

        private Node(int data, Node leftNode, Node rightNode) {
            this.data = data;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }

        public void initialiseDefaults() {
            this.data = 1;
            Node node1 = new Node(1, null, null);
            Node node3 = new Node(3, null, null);
            Node node2 = new Node(2, node1, node3);
            Node node5 = new Node(5, null, null);
            this.leftNode = node2;
            this.rightNode = node5;
        }
        public void initialiseDefaultsBadCase() {
            this.data = 1;
            Node node4 = new Node(4, null, null);
            Node node5 = new Node(5, null, null);
            Node node2 = new Node(6, node4, node5);
            Node node3 = new Node(3, null, null);
            this.leftNode = node2;
            this.rightNode = node3;
        }
    }
}
