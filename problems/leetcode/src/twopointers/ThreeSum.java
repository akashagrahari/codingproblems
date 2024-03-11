package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * https://leetcode.com/problems/3sum/description/
 */
public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {3,0,-2,-1,1,2};
        System.out.println(threeSum.threeSum(nums));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<List<Integer>>();

        for (int i = 0; i< nums.length; i++) {
            int target = nums[i];
            int l = i+1;
            int r = nums.length - 1;
            while (l<r) {
                int sum = - (nums[l] + nums[r]);
                if (sum < target) {
                    r--;
                } else if (sum > target) {
                    l++;
                } else {
                    List<Integer> outputEl = new ArrayList<Integer>();
                    outputEl.add(nums[i]);
                    outputEl.add(nums[l]);
                    outputEl.add(nums[r]);
                    if (!output.contains(outputEl)) {
                        output.add(outputEl);
                    }
                    l++;
                    r--;
                }
            }
        }
        return output;
    }
}
//-4,-1,-1,0,1,2
