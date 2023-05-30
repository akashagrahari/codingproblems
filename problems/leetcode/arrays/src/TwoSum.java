import java.util.*;

/**
 * Iterate over array. If you find the complement in reference map return curr,complement index.
 * Else add element to reference map
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public static void main(String args[]) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(twoSum.twoSum(nums, 6)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> refMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(refMap.containsKey(complement)) {
                return new int[] {refMap.get(complement), i};
            } else {
                refMap.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}
