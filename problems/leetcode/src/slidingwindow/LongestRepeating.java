package slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * sliding window. While moving right pointer, figure out which character has the most occurences.
 * And if length minus this value is greater than k then move the left pointer.
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 */

public class LongestRepeating {
    public static void main(String[] args) {
        LongestRepeating longestRepeating = new LongestRepeating();
        System.out.println(longestRepeating.characterReplacement("AABABBA", 1));
    }

    public int characterReplacement(String s, int k) {
        Map<Character, Integer> refMap = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxCountOfOneChar = 0;
        int maxLen = 0;

        while(r < s.length()) {
            refMap.put(s.charAt(r), refMap.getOrDefault(s.charAt(r), 0) + 1);
            maxCountOfOneChar = Math.max(maxCountOfOneChar, refMap.get(s.charAt(r)));

            if((r - l + 1) - maxCountOfOneChar > k) {
                refMap.put(s.charAt(l), refMap.get(s.charAt(l)) - 1);
                l++;
            }
            maxLen = Math.max(maxLen, r - l +1);
            r++;
        }
        return maxLen;
    }
}
