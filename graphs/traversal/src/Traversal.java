/**
 * Created by akash on 20/9/18.
 */
public class Traversal {


    public static void main (String args[]) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.initialiseDefaults();
        System.out.println("In order -");
        printInorder(binaryTree);
        System.out.println();
        System.out.println("Post order -");
        printPostorder(binaryTree);
        System.out.println();
        System.out.println("Pre order -");
        printPreorder(binaryTree);
        System.out.println();
    }

    private static void printPreorder(BinaryTree binaryTree) {
        if(binaryTree == null) {
            return;
        }
        System.out.print(binaryTree.data + " ");
        printPreorder(binaryTree.leftBinaryTree);
        printPreorder(binaryTree.rightBinaryTree);
    }

    private static void printPostorder(BinaryTree binaryTree) {
        if(binaryTree == null) {
            return;
        }

        printPostorder(binaryTree.leftBinaryTree);
        printPostorder(binaryTree.rightBinaryTree);
        System.out.print(binaryTree.data + " ");
    }

    private static void printInorder(BinaryTree binaryTree) {
        if(binaryTree == null) {
            return;
        }

        printInorder(binaryTree.leftBinaryTree);
        System.out.print(binaryTree.data + " ");
        printInorder(binaryTree.rightBinaryTree);
    }

    private static class BinaryTree {

        private int data;
        private BinaryTree leftBinaryTree;
        private BinaryTree rightBinaryTree;

        BinaryTree() {
        }

        private BinaryTree(int data, BinaryTree leftBinaryTree, BinaryTree rightBinaryTree) {
            this.data = data;
            this.leftBinaryTree = leftBinaryTree;
            this.rightBinaryTree = rightBinaryTree;
        }

        public void initialiseDefaults() {
            this.data = 1;
            BinaryTree node4 = new BinaryTree(4, null, null);
            BinaryTree node5 = new BinaryTree(5, null, null);
            BinaryTree node2 = new BinaryTree(2, node4, node5);
            BinaryTree node3 = new BinaryTree(3, null, null);
            this.leftBinaryTree = node2;
            this.rightBinaryTree = node3;
        }
    }

}

