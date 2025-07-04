package DSA.Arrays;

import java.util.HashSet;

//217 - Contains duplicate 
//leetcode link - https://leetcode.com/problems/contains-duplicate/

public class leetcode217 {
     public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> num = new HashSet<>();
        for (int n : nums) {
            if (num.contains(n)) {
                return true;
            } else {
                num.add(n);
            }
        }
        return false;
    }
}
