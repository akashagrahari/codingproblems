import java.util.HashSet;
import java.util.Set;

/**
 * Approach 1: (Implemented - containsDuplicate()) Travel through the array and check if the number is in a set.
 * If yes, then it's duplicate; else add it to the set.
 *
 * Approach 2: (Not Implemented) Sort the set and travel through the set to see if there are any adjacent duplicates.
 *
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate.containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
