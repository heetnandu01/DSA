package DSA.strings;

import java.util.HashMap;

//387 - First Unique Character in a String
//leetcode link:https://leetcode.com/problems/first-unique-character-in-a-string/

public class leetcode387 {
     public int firstUniqChar(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for(char ch:s.toCharArray()){
            hash.put(ch,hash.getOrDefault(ch,0) + 1);
        }

        for(int i = 0;i<s.length();i++){
            if(hash.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
