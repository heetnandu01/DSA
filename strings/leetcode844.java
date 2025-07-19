package DSA.strings;

//844 - Backspace String Compare
//leetcode link - https://leetcode.com/problems/backspace-string-compare/description/

public class leetcode844 {
     public boolean backspaceCompare(String s, String t) {
        StringBuilder finalS = new StringBuilder();
        StringBuilder finalT = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '#') {
                if (finalS.length() > 0) {
                    finalS.deleteCharAt(finalS.length() - 1);
                }
            } else {
                finalS.append(ch);
            }
        }
        for(int i = 0;i < t.length();i++){
            char ch = t.charAt(i);
            if(ch == '#'){
                if(finalT.length() > 0){
                    finalT.deleteCharAt(finalT.length() -1);
                }
            }else {
                finalT.append(ch);
            }
        }
        return finalS.toString().equals(finalT.toString());
    }
}
