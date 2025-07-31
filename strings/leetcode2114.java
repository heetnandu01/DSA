package DSA.strings;

//2114 - Maximum Number of Words Found in Sentences
//leetcode link:https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/

public class leetcode2114 {
    public int mostWordsFound(String[] sen) {
        int count = -1;
        for (String s : sen) {
            count = Math.max(count, scount(s));
        }
        return count;
    }

    private int scount(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                c++;
            }
        }
        return c + 1;
    }
}

