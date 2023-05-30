/**
 *
 * https://leetcode.com/problems/container-with-most-water/
 */
public class Container {
    public static void main(String[] args) {
        Container container = new Container();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(container.maxArea(arr));
    }

    public int maxArea(int[] height) {
        int curr = 0;
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int b = right - left;
            int h = Math.min(height[left], height[right]);
            curr = b*h;
            if (curr > max) {
                max = curr;
            }
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
