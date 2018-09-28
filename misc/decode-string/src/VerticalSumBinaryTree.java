import java.util.HashMap;
import java.util.Map;

/**
 * Created by akash on 27/9/18.
 */
public class VerticalSumBinaryTree {

    private static HashMap<Integer, Integer> offSetSumMap = new HashMap<>();
    public static void main(String args[]) {
        Node treeHead = getBinaryTree();
        getVerticalSums(treeHead, 0);
        for(Integer key : offSetSumMap.keySet()) {
            System.out.println(key+ ":"+ offSetSumMap.get(key));
        }
    }

    private static void getVerticalSums(Node node, int horizontalOffset) {
        if(offSetSumMap.containsKey(horizontalOffset)) {
            Integer value = offSetSumMap.get(horizontalOffset);
            value = value + node.data;
            offSetSumMap.put(horizontalOffset, value);
        } else {
            offSetSumMap.put(horizontalOffset, node.data);
        }
        if(node.leftNode !=null ) {
            getVerticalSums(node.leftNode, horizontalOffset-1);
        }
        if(node.rightNode !=null ) {
            getVerticalSums(node.rightNode, horizontalOffset+1);
        }
    }

    private static Node getBinaryTree() {
        Node node4 = new Node(4, null, null);
        Node node5 = new Node(5, null, null);
        Node node6 = new Node(6, null, null);
        Node node7 = new Node(7, null, null);
        Node node2 = new Node(2, node4, node5);
        Node node3 = new Node(3, node6, node7);
        return new Node(1, node2, node3);
    }


    private static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data, Node leftNode, Node rightNode) {
            this.data = data;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }
    }
}
