package DSA.Arrays;

//268 - Missing Number
//leetcode problem - https://leetcode.com/problems/missing-number/description/

public class leetcode268 {
    public int missingNumber(int[] nums) {
        int xor = nums.length;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i] ^ i;
        }
        return xor;
    }
}
