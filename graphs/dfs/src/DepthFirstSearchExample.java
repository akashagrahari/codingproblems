import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by akash on 18/9/18.
 */
public class DepthFirstSearchExample {
    private static Stack<Node> nodeStack = new Stack<Node>();

    private static class Node {
        int data;
        boolean visited;
        public ArrayList<Node> neighbours;

        public Node(int data) {
            this.data = data;
            this.neighbours = new ArrayList<>();
            this.visited = false;
        }

        public void addNeighbours(Node neighbourNode) {
            this.neighbours.add(neighbourNode);
        }

        public ArrayList<Node> getNeighbours()  {
            return this.neighbours;
        }

        public boolean isVisited() {
            return visited;
        }

        public void markVisited() {
            this.visited = true;
        }
    }

    private static void depthFirstSearch(Node node) {
        if(node.isVisited()) {
            return;
        }
        node.markVisited();
        System.out.println(node.data);
        ArrayList<Node> neighbours = node.getNeighbours();
        for (int i = 0; i < neighbours.size(); i++) {
            Node element = neighbours.get(i);
            if (element != null) {
                depthFirstSearch(neighbours.get(i));
            }
        }
    }

    public static void main(String args[]) {
        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);

        node40.addNeighbours(node10);
        node40.addNeighbours(node20);
        node10.addNeighbours(node30);
        node20.addNeighbours(node10);
        node20.addNeighbours(node30);
        node20.addNeighbours(node60);
        node20.addNeighbours(node50);
        node30.addNeighbours(node60);
        node60.addNeighbours(node70);
        node50.addNeighbours(node70);

        depthFirstSearch(node40);
    }
}

