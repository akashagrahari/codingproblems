/**
 * Created by akash on 20/9/18.
 */
public class ConstructTree {

    static int preorderPos = 0;

    public static void main(String args[]) {
        String inorderSequence = "DBEAFC";
        String preorderSequence = "ABDECF";
        ConstructTree constructTree = new ConstructTree();
        Node finalTree = constructTree.buildTree(inorderSequence, preorderSequence);
        printPreorder(finalTree);
    }

    private Node buildTree(String inorderSequence, String preorderSequence) {
        if(inorderSequence.length()==0) {
            return null;
        }
        char nodeData = preorderSequence.charAt(preorderPos);
        System.out.println();
        System.out.println("Blah = "+nodeData);
        System.out.println("Inorder = "+ inorderSequence);
        System.out.println("preorder pos = "+ preorderPos);

        preorderPos++;
        int nodeDataIndexInorder = getNodeDataIndexInorder(inorderSequence, nodeData);
        String leftString = inorderSequence.substring(0, nodeDataIndexInorder);
        String rightString = inorderSequence.substring(nodeDataIndexInorder+1);
        System.out.println("Left = "+leftString);
        System.out.println("Right = "+rightString);
        Node node = new Node(nodeData,
                buildTree(leftString, preorderSequence),
                buildTree(rightString, preorderSequence));
        return node;
    }

    private int getNodeDataIndexInorder(String inorderSequence, char nodeData) {
        for(int i=0; i < inorderSequence.length(); i++) {
            if(inorderSequence.charAt(i)==nodeData){
                return i;
            }
        }
        return -1;
    }
    private static void printPreorder(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node.data + " ");
        printPreorder(node.leftNode);
        printPreorder(node.leftNode);
    }

    private class Node {
        private char data;
        private Node leftNode;
        private Node rightNode;

        public Node(char nodeData, Node leftNode, Node rightNode) {
            this.data = nodeData;
            this.leftNode = leftNode;
            this.rightNode = rightNode;

        }
    }
}
