package DSA.Arrays;

//287 - Find the Duplicate Number
//leetcode link: https://leetcode.com/problems/find-the-duplicate-number/

/*
What Is Floyd's Cycle Detection (Tortoise and Hare)?
This is a technique to detect a loop in a structure without using extra space.
Imagine:
A slow runner (Tortoise 🐢): moves one step at a time
A fast runner (Hare 🐇): moves two steps at a time
They both start walking (following nums[i] as the next step).
 */

public class leetcode287 {
      public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        slow = nums[0];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}