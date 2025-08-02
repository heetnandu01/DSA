package DSA.strings;

//1957 - Delete Characters to Make Fancy String
//leetcode link:https://leetcode.com/problems/delete-characters-to-make-fancy-string/description/

public class leetcode1957 {
     public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        sb.append(s.charAt(0));
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                count = 1;
            }
            if(count < 3){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
