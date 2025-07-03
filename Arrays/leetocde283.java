package DSA.Arrays;

//283 - Move Zeroes
//leetcode problem - https://leetcode.com/problems/move-zeroes/description/

public class leetocde283 {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }   
        }
        while(k < nums.length){
            nums[k] = 0;
            k++;
        }
    }
}
