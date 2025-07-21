package DSA.Arrays;

//1752 - Check if Array Is Sorted and Rotated
//leetcode link:https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

public class leetcode1752 {
      public boolean check(int[] nums) {
        int count  = 0;
        int n  = nums.length;
        for(int i = 0 ;i < n;i++){
            if(nums[i] > nums[(i+1)%n]){
                count++;
            }
        }
        return count <= 1;
    }
}
