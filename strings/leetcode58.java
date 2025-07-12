package DSA.strings;

//58 - Length of the last word
//leetcode link:https://leetcode.com/problems/length-of-last-word/description/

public class leetcode58 {
     public int lengthOfLastWord(String s) {
        s= s.trim();
        int count = 0;
        for(int i = s.length() -1;i >= 0;i--){
            if(s.charAt(i) != ' '){
                count ++;
            }else if(count > 0){
                break;
            }
        }
        return count;
    }
}