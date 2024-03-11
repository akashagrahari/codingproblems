package dynamic;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        HouseRobber obj = new HouseRobber();
        int nums[] = {2,7,9,3,1};
        System.out.println(obj.rob(nums));
    }

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        return Math.max(nums[0] + rob(Arrays.copyOfRange(nums, 2, nums.length)),
                rob(Arrays.copyOfRange(nums, 1, nums.length)));
    }

//    public int rob(int[] nums) {
//        // int max = nums[0];
//        int prevMax = 0;
//        int nextMax = nums[0];
//
//        for(int i = 1; i<nums.length; i++) {
//            int temp = nextMax;
//            nextMax = prevMax + nums[i];
//            prevMax = temp;
//            nextMax = Math.max(prevMax, nextMax);
//        }
//
//        return nextMax;
//    }
}
