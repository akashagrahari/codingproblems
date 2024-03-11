package arrays;

import java.util.Arrays;

/**
 * Problem is framed badly. Ignore this mostly
 * Sort and check counts. While keeping a max count
 * https://leetcode.com/problems/longest-consecutive-sequence/
 */
public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        int[] arr = {1,2,0,1};
        LongestConsecutiveSeq longestConsecutiveSeq = new LongestConsecutiveSeq();
        System.out.println(longestConsecutiveSeq.longestConsecutive(arr));
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int max = 1;

        for(int i = 0 ; i < nums.length - 1; i++) {
            if (nums[i+1] - nums[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else if (nums[i+1] == nums[i]) {

            } else  {
                count = 1;
            }
        }

        return max;
    }
}
