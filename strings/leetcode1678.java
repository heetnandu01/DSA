package DSA.strings;

//1678 - Goal Parser Interpretation
//leetcode link:https://leetcode.com/problems/goal-parser-interpretation/description/

public class leetcode1678 {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < command.length(); i++) {
            char ch = command.charAt(i);
            if (ch == 'G') {
                sb.append("G");
            } else if (ch == '(' && command.charAt(i + 1) == ')') {
                sb.append("o");
                i++; 
            } else if (ch == '(' && command.charAt(i + 1) == 'a') {
                sb.append("al");
                i += 3; 
            }
        }
        return sb.toString();
    }
}
