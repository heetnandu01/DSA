package DSA.Arrays;

//136 - single number
//leetcode problem - https://leetcode.com/problems/single-number/


public class leetcode136 {
     public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0;i<nums.length;i++){
            xor ^= nums[i];
        }
        return xor;
    }
}
