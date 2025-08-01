package DSA.Arrays;

//1920 - Build Array from Permutation
//leetcode Link:https://leetcode.com/problems/build-array-from-permutation/description/

public class leetcode1920 {
     public int[] buildArray(int[] nums) {
        int [] result = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
