package DSA.Arrays;

//169 - Majority Element
//leetcode link:https://leetcode.com/problems/majority-element/description/

/*
Boyer-Moore Voting Algorithm:

It’s a clever voting technique to find the majority element (the one that appears more than ⌊n / 2⌋ times) — using only:
One pass
Two variables
No extra memory (O(1) space)
 */

public class leetcode169 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for(int num:nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count ++;
            }
            else{
                count --;
            }
        }
        return candidate;
    }
}
