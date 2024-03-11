package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Approach 1 (Implemented - isAnagram()): Create two maps and perform equals() - slower solution
 *
 * Approach 2 (Not implemented): Create an array of 26 characters and ++/-- for both strings for respective chars.
 * If any index != 0, not an anagram. Other it is an anagram
 *
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("anagram", "nagaram"));
        System.out.println(validAnagram.isAnagram("car", "rat"));
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if(mapS.containsKey(chS)) {
                mapS.put(chS, mapS.get(chS) + 1);
            } else {
                mapS.put(chS, 1);
            }
            if(mapT.containsKey(chT)) {
                mapT.put(chT, mapT.get(chT) + 1);
            } else {
                mapT.put(chT, 1);
            }
        }
        return mapT.equals(mapS);
    }
}

