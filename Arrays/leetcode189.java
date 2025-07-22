package DSA.Arrays;

//189 - Rotate Array
//leetcode link: https://leetcode.com/problems/rotate-array/description/

public class leetcode189 {
     public void rotate(int[] nums, int k){
        k = k % nums.length;
        int n = nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public void reverse(int [] nums,int left , int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
