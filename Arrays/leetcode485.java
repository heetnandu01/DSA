package DSA.Arrays;

//485 - Max Consecutive Ones
//leetcode problem -  https://leetcode.com/problems/max-consecutive-ones/description/

public class leetcode485 {
     public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                count ++;
                max = Math.max(max,count);
            }else{
                count = 0;
            }
        }
        return max;
    }
}
