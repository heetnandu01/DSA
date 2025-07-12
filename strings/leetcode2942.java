package DSA.strings;

import java.util.ArrayList;
import java.util.List;

//2942: Find Words Containing Character
//leetcode link:https://leetcode.com/problems/find-words-containing-character/description/

public class leetcode2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                result.add(i);
            }
        }
        return result;
    }
}
