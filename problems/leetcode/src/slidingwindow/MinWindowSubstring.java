package slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Revisit this problem. It took forever and I am not sure if you understand completely yet.
 * https://leetcode.com/problems/minimum-window-substring/
 */

public class MinWindowSubstring {

    public static void main(String[] args) {
        MinWindowSubstring minWindowSubstring = new MinWindowSubstring();
        System.out.println(minWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
    }


    public String minWindow(String s, String t) {
        Map<Character,Integer> tMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();
        int reqT = t.length();
        int currS = 0;
        int minWinLength = Integer.MAX_VALUE;
        String minWin = "";

        for(int i = 0 ; i< t.length(); i++ ) {
            char ch = t.charAt(i);
            if(tMap.containsKey(ch)) {
                tMap.put(ch, (tMap.get(ch) + 1));
            } else {
                tMap.put(ch, 1);
            }
        }

        int l = 0;
        int r = 0;

        while(r<s.length() && l<s.length() && l<=r) {
            if(currS < reqT) {
                char chR = s.charAt(r);
                if(tMap.containsKey(chR)) {
                    if(sMap.getOrDefault(chR, 0) < tMap.get(chR)) {
                        currS++;
                    }
                    sMap.put(chR, sMap.getOrDefault(chR, 0) + 1);
                }
            } else {
                if((r - l + 1) < minWinLength ) {
                    minWinLength = r-l+1;
                    minWin = s.substring(l,r+1);
                }
                char chL = s.charAt(l);
                if(tMap.containsKey(chL)) {
                    if(sMap.getOrDefault(chL, 0 ) <= tMap.get(chL)) {
                        currS--;
                    }
                    int value = sMap.getOrDefault(chL, 0)-1 ;
                    if (value < 0) { value = 0;}
                    sMap.put(chL, value );
                }
                l++;
            }
            if(currS < reqT) {
                r++;
            }
        }
        return minWin;

    }
}
