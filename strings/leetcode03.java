package DSA.strings;

import java.util.HashSet;
import java.util.Set;

//03 - Longest Substring Without Repeating Characters
//leetcode link : https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

public class leetcode03 {
    public int lengthOfLongestSubstring(String s) {
        int left  = 0;
        int right = 0;
        int result = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()){
            char ch = s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
                result = Math.max(result, right - left +1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return result;
    }    
}
