import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/**
 * creating a sliding window. When you encounter a character which you have seen before and after the current left window,
 * update the left window to after this point
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstring {
    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println(longestSubstring.lengthOfLongestSubstring("au"));
    }

    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }
        int l = 0;
        int r = 1;
        int max = 1;
        Map<Character, Integer> refMap = new HashMap<>();
        refMap.put(s.charAt(l), l);
        while(l < r && r < s.length()) {
            if (refMap.containsKey(s.charAt(r))) {
                if(refMap.get(s.charAt(r)) >= l) {
                    l = refMap.get(s.charAt(r)) + 1;
                }
            }
            refMap.put(s.charAt(r), r);
            max = Math.max(r-l+1, max);
            r++;
        }
        return max;
    }
    public int lengthOfLongestSubstringTemp(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;

        int l = 0;
        int r = 0;

        while(r < s.length()) {
            while(set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max = Math.max(max, r-l+1);
            r++;
        }

        return max;
    }
}
