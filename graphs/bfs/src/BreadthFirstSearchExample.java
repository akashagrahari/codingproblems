import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by akash on 17/9/18.
 */
public class BreadthFirstSearchExample {

    public static Queue<Node> nodeQueue = new LinkedList<>();

    private static class Node {
        int data;
        boolean visited;
        ArrayList<Node> neighbours;

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

    private static void breadthFirstSearch(Node node) {
        nodeQueue.add(node);
        node.markVisited();
        while (!nodeQueue.isEmpty()) {
            Node element = nodeQueue.remove();
            System.out.println(element.data);
            ArrayList<Node> neighbours = element.getNeighbours();
            for (int i=0; i<neighbours.size(); ++i) {
                element = neighbours.get(i);
                if (element!=null && !element.isVisited()) {
                    nodeQueue.add(element);
                    element.markVisited();
                }
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

        breadthFirstSearch(node40);
    }
}
