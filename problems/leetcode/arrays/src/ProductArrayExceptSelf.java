import java.util.Arrays;


/**
 * This question is SUPER TRICKY.
 * Think in terms of {a,b,c,d}
 * Output should be {bcd, acd, abd, abc}
 * First create {1,a,ab,abc} ---- (1)
 * Then keeping tempVar as = {bcd,cd,d,1} .... (2)
 * Answer is (1) x (2)
 *
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProductArrayExceptSelf {

    public static void main(String[] args) {
        ProductArrayExceptSelf obj = new ProductArrayExceptSelf();
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(obj.productExceptSelf(arr)));
    }

    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            int prefix = 1;
            if(i!=0) {
                prefix = output[i-1] * nums[i-1];;
            }
            output[i] = prefix;
        }
        int suffix = 1;
        for(int i = nums.length-1; i >= 0; i--) {
            output[i] = suffix * output[i];
            suffix*= nums[i];
        }

        return output;
    }
}
