package binarysearch;

/**
 *
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class MinInSortedArray {
    public static void main(String[] args) {
        MinInSortedArray minInSortedArray = new MinInSortedArray();
        int[] arr = {3,4,5,1,2};
        System.out.println(minInSortedArray.findMin(arr));
    }

    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int mid = (l+r)/2;

        while(l <= r) {
            if(mid+1 < nums.length) {
                if(nums[mid+1] < nums[mid]) {
                    return nums[mid+1];
                }
            }

//            if(mid-1 >= 0) {
//                if(nums[mid] < nums[mid-1]) {
//                    return nums[mid];
//                }
//            }

            if(nums[l] <= nums[mid]) {
                l = mid+1;
            } else {
                r = mid-1;
            }

            mid = (l+r)/2;
        }
        return nums[0];
    }
}
