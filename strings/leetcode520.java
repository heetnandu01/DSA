package DSA.strings;

//520 - Detect capital
//leetcode link: https://leetcode.com/problems/detect-capital/description/

public class leetcode520 {
     public boolean detectCapitalUse(String word) {
        int count = 0;
        for(char ch:word.toCharArray()){
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        if(count == word.length() || count  == 0){
            return true;
        }
        if(count == 1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;
    }
}

