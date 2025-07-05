package DSA.Arrays;

//53 – Maximum Subarray (Kadane's Algorithm)

// What is Kadane’s Algorithm?
// It’s a smart way to find the maximum sum of a contiguous subarray (a subarray with consecutive elements) from a given array.
// Instead of checking all possible subarrays, Kadane’s keeps track of:
// 🔸 The current running sum
// 🔸 The maximum sum so far
// It updates them as it walks through the array.

//leetcode link:https://leetcode.com/problems/maximum-subarray/description/

public class leetcode53 {
     public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;
        for(int num:nums){
            currentSum += num;
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
