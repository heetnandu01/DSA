package DSA.Arrays;

//152 - Maximum Product SubArray
//leetcode link - https://leetcode.com/problems/maximum-product-subarray/

public class leetcode152 {
     public int maxProduct(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int result = nums[0];
        for(int i =1;i<nums.length;i++){
            int num = nums[i];
            if(num < 0){
                int temp = maxSum;
                maxSum = minSum;
                minSum = temp;
            }

            maxSum = Math.max(num, num * maxSum);
            minSum = Math.max(num, num * minSum);
            result = Math.max(result,maxSum);
        }
        return result;
    }
}
