package DSA.Arrays;

//27.  Remove element 
// leetcode link - https://leetcode.com/problems/remove-element/

public class leetcode27 {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
