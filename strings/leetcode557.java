package DSA.strings;

//557 - Reverse Words in a String III
//leetcode link:https://leetcode.com/problems/reverse-words-in-a-string-iii/description/


public class leetcode557 {
    public String reverseWords(String s) {
        StringBuilder name1 = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            StringBuilder name2 = new StringBuilder();
            name2.append(words[i]);   
            name2.reverse();          
            name1.append(name2);   
            if (i != words.length - 1) {
                name1.append(" ");  
            }
        }
        return name1.toString();
    }
}
