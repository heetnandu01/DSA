package DSA.strings;

//709 :To Lower Case
//leetcode link:https://leetcode.com/problems/to-lower-case/

// Most Optimal Approach

// class leetcode709{ 
//     public String toLowerCase(String s) {
//     return s.toLowerCase();       
// }}

public class leetcode709 {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
