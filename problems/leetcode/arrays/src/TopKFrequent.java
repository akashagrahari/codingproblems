import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Very important HEAP problem.
 * https://leetcode.com/problems/top-k-frequent-elements/
 */

public class TopKFrequent {
    public static void main(String[] args) {
        TopKFrequent topKFrequent = new TopKFrequent();
        int[] arr = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent.topKFrequent(arr, 2)));
    }

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }
//        Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> freqMap.get(b) - freqMap.get(a));
        minHeap.addAll(freqMap.keySet());

        int[] output = new int[k];
        for(int i=0; i< k ; i++) {
            output[i] = minHeap.poll();
        }
        return output;
    }
}
