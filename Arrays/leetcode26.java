package DSA.Arrays;

// 26.Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class leetcode26 {
   public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1;j < nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}