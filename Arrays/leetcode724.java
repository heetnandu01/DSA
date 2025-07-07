package DSA.Arrays;

//724 - Find Pivot Index
//leetcode link:https://leetcode.com/problems/find-pivot-index/

public class leetcode724 {
     public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(leftSum == totalSum - leftSum -nums[i]){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
