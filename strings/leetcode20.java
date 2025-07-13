package DSA.strings;

import java.util.Stack;

//20:valid Parentheses
//leetcode link:https://leetcode.com/problems/valid-parentheses/description/

public class leetcode20 {
     public boolean isValid(String s) {
        Stack<Character> sb = new Stack<>();
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                sb.push(c);
            }else{
                if(sb.isEmpty()) return false;
                char top = sb.peek();
                if((c == ')' && top == '(') ||
                   (c == '}' && top == '{') ||
                   (c == ']' && top == '[')){
                    sb.pop();
                }else{
                    return false;
                }
            }
        }
        return sb.isEmpty();
    }
}
