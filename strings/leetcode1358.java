package DSA.strings;

//1358 - Number of Substrings Containing All Three Characters
//leetcode link : https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/

public class leetcode1358 {
     public int numberOfSubstrings(String s) {
        int[] count = new int[3]; 
        int left = 0, result = 0;
        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++;
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                result += s.length() - right;
                count[s.charAt(left++) - 'a']--;
            }
        }
        return result;
    }
}
