package DSA.strings;

import java.util.ArrayList;
import java.util.List;

//1408 - String Matching in an Array
//leetcode link:https://leetcode.com/problems/string-matching-in-an-array/description/

public class leetcode1408 {
     public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
               if(i!=j && words[j].contains(words[i])){
                list.add(words[i]);
                break;
               }
            }
        }
        return list;
    }
}

