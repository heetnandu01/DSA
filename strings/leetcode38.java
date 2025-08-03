package DSA.strings;

//38 - Count and Say
//leetcode link:https://leetcode.com/problems/count-and-say/description/

public class leetcode38 {
    class Solution {
    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int j = 0; j < result.length() - 1; j++) {
                if (result.charAt(j) == result.charAt(j + 1)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(result.charAt(j));
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(result.charAt(result.length() - 1));
            result = sb.toString();
        }
        return result;
    }
}

}
