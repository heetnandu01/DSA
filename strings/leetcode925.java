package DSA.strings;

//925 - Long Pressed Name
//Leetcode link:https://leetcode.com/problems/long-pressed-name/description/

public class leetcode925 {
     public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        while(j < typed.length()){
            if(i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }else if(j > 0 && typed.charAt(j) == typed.charAt(j-1)){
                j++;
            }else{
                return false;
            }
        } 
        return i == name.length();
    }
}
