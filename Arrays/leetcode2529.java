package DSA.Arrays;

// 2529 - Maximum Count of Positive Integer and Negative Integer
//leetcode link:https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/


public class leetcode2529 {
        public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for(int n:nums){
            if(n>0){
                pos++;
            }else if(n < 0){
                neg++;
            }
        }
        return Math.max(pos,neg);
    }
}