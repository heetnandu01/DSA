package DSA.Arrays;

//643. Maximum Average SubArray 1
//leetcode link:https://leetcode.com/problems/maximum-average-subarray-i/description/

/*
📌 Definition:
Sliding Window is a technique where you create a window (usually a subset of elements) and move it across the data structure to find an optimal solution (like max/min/sum/length/etc.) without recalculating results from scratch.

✅ When to Use:
Contiguous subarray/substring
Fixed-size or variable-size window
Optimize time complexity (from O(n²) to O(n))

🧠 Core Idea:
Use two pointers (start and end)
Expand the window to include new elements
Shrink the window when constraints are violated
Track the result (sum, max, count, etc.)

*/

public class leetcode643 {
     public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int maxSum = 0;
        while(right < k){
            currentSum += nums[right];
            right++;
        }
        maxSum = currentSum;
        while(right < nums.length){
            currentSum -= nums[left];
            currentSum += nums[right];
            maxSum = Math.max(maxSum,currentSum);
            left++;
            right++;
        }
        return maxSum / (double) k;
    }    
}
