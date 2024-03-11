package binarysearch;

/**
 * Check if mid is the target
 * If left is sorted. Then look if target is between max/min of left array. If yes, then shift r to mid -1. And vice versa
 * If right is sorted ...
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */

public class SearchInRotated {
    public static void main(String[] args) {
        SearchInRotated searchInRotated = new SearchInRotated();
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(searchInRotated.search(arr, 0));
    }

    public int search(int[] nums, int target) {
        // length - 0th element index = k
        int left = 0;
        int right = nums.length-1;
        int mid = (left + right)/2;

        while (left <= right) {
            if(nums[mid] == target) {
                return mid;
            }

            //if left is sorted
            if(nums[left] <= nums[mid]) {
                if (target < nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            if(nums[mid] <= nums[right]) {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            mid = (left+right)/2;
        }
        return -1;
    }
}
