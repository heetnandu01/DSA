package DSA.strings;

//28 -Find the Index of the First Occurrence in a String
//leetcode link:https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/


public class leetcode28 {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 00){
            return 0;
        }
        for(int i = 0;i <= haystack.length() - needle.length();i++){
            if(haystack.substring(i,i + needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
