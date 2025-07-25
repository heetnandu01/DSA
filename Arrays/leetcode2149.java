package DSA.Arrays;

//2149 - Rearrange Array Elements by sign
//leetcode link:https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

public class leetcode2149 {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for (int num : nums) {
            if (num > 0) {
                res[pos] = num;
                pos += 2;
            } else {
                res[neg] = num;
                neg += 2;
            }
        }
        return res;
    }
}
