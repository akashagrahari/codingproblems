package arrays;

import java.util.*;

/**
 * Sort a given string to make a key from it. Store a map with key and all anagrams
 * https://leetcode.com/problems/group-anagrams/
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String []strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams.groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> dict = new HashMap<>();
        for(int i = 0 ; i < strs.length; i++ ) {
            char []charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String key = new String(charArr);
            if(dict.containsKey(key)) {
                dict.get(key).add(strs[i]);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                dict.put(key, newList);
            }
        }
        List<List<String>> output = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry : dict.entrySet()) {
            output.add(entry.getValue());
        }
        return output;
    }
}
