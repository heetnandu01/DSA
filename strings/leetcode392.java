package DSA.strings;

//392 - ls Subsequence
//leetcode link :https://leetcode.com/problems/is-subsequence/description/

public class leetcode392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
