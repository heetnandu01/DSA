package DSA.strings;

import java.util.Map;

//13 - Roman to Integer
//leetcode link:https://leetcode.com/problems/roman-to-integer/description/

public class leetcode13 {
      public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
            'I',1,
            'V',5,
            'X',10,
            'L',50,
            'C',100,
            'D',500,
            'M',1000);
        int total = 0;
        for(int i = 0;i<s.length();i++){
            int currentval = map.get(s.charAt(i));
            if(i + 1 < s.length()){
                int nextval = map.get(s.charAt(i + 1));
                if(currentval < nextval){
                    total -= currentval;
                }else{
                    total += currentval;
                }
            }else{
                total += currentval;
            }
        }
        return total;
    }
}
