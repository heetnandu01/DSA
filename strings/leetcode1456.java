package DSA.strings;

import java.util.Set;

//1456 - Maximum Number of Vowels in a Substring of Given Length

//leetcode link : https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/

public class leetcode1456 {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a','i','e','o','u');
        int count = 0;
        int max = 0;
        for(int i = 0; i< k;i++){
            if(vowels.contains(s.charAt(i))){
                count++;
            }
        }
        max = count ;
        for(int i = k;i<s.length();i++){
            if(vowels.contains(s.charAt(i))){
                count++;
            }
            if(vowels.contains(s.charAt(i - k))){
                count--;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}