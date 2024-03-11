package dynamic;

import java.util.Arrays;

public class HouseRobberII {
    public static void main(String[] args) {
        HouseRobberII obj = new HouseRobberII();
        int nums[] = {2,3,2};
        System.out.println(obj.rob(nums));
    }

    public int rob(int[] nums) {
        int left = helper(Arrays.copyOfRange(nums, 0, nums.length - 1));
        int right = helper(Arrays.copyOfRange(nums, 1, nums.length));
        return Math.max(left, right);
    }

    public int helper(int[] nums) {
        // int max = nums[0];
        int prevMax = 0;
        int nextMax = nums[0];

        for(int i = 1; i<nums.length; i++) {
            int temp = nextMax;
            nextMax = prevMax + nums[i];
            prevMax = temp;
            nextMax = Math.max(prevMax, nextMax);
        }

        return nextMax;
    }
}
