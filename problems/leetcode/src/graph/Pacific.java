package graph;

import java.util.ArrayList;
import java.util.List;

public class Pacific {
    public static void main(String[] args) {
        Pacific pacific = new Pacific();
        int[][] heights = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        List<List<Integer>> result = pacific.pacificAtlantic(heights);
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                List<Integer> curr = new ArrayList<>();
                curr.add(i);
                curr.add(j);
                traverse(i, j, result, curr, heights);
            }
        }
        return result;
    }

    private void traverse(int i, int j, List<List<Integer>> result, List<Integer> curr, int[][] heights) {
        if (i <  0 || i >= heights.length || j < 0 || j > heights[0].length || heights[i][j] > heights[curr.get(0)][curr.get(1)]) {
            return;
        }
        return;
    }
}
