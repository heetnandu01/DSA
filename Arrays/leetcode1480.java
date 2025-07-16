package DSA.Arrays;

//1480 - Running Sum of 1d Array
//leetcode link:https://leetcode.com/problems/running-sum-of-1d-array/

public class leetcode1480 {
     public int[] runningSum(int[] nums) {
        int sum  = 0;
        for(int i = 1;i<nums.length;i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
