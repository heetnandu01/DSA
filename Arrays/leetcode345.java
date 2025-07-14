package DSA.Arrays;

//345 - Reverse Vowels of a String
//leetcode link:https://leetcode.com/problems/reverse-vowels-of-a-string/description/

public class leetcode345 {
    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int start = 0,end = s.length()-1;
        while(start <= end){
            if(!isVowel(ch[start])){
                start++;
            }else if(!isVowel(ch[end])){
                end--;
            }else{
                char temp = ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }
    private boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='O'||c=='I'||c=='U'){
            return true;
        }
        return false;
    }
}
