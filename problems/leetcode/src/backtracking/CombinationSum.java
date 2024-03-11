package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        CombinationSum obj = new CombinationSum();
        System.out.println(Arrays.toString(obj.combinationSum(candidates, target).toArray()));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        LinkedList<Integer> comb = new LinkedList<>();

        backtrack(comb, output, candidates, target, 0);

        return output;
    }

    private void backtrack(LinkedList<Integer> comb, List<List<Integer>> output, int[] candidates, int target, int start) {
        if(target == 0) {
            output.add(new ArrayList<>(comb));
            return;
        } else if (target < 0 ) {
            return;
        }

        for(int i = start; i< candidates.length; i++) {
            comb.add(candidates[i]);
            backtrack(comb, output, candidates, target - candidates[i], i);
            comb.removeLast();
        }
    }
}

