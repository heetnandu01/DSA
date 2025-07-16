package DSA.strings;

//1528 - Shuffle String
//leetcode link:https://leetcode.com/problems/shuffle-string/

public class leetcode1528 {
       public String restoreString(String s, int[] indices) {
        char[]result =new char [s.length()];
        for(int i=0;i<s.length();i++){
            result[indices[i]]=s.charAt(i);
        }
        return new String(result);
    }
}