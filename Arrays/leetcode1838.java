package DSA.Arrays;

import java.util.Arrays;

//1838 - Frequency of the Most Frequent Element
//leetcode link:https://leetcode.com/problems/frequency-of-the-most-frequent-element/description/

public class leetcode1838{
      public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        long total = 0;
        int max = 0;
        for (int right = 0; right < nums.length; right++) {
            total += nums[right];
            while ((long)(right - left + 1) * nums[right] - total > k) {
                total -= nums[left];
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}



