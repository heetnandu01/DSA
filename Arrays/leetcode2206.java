package DSA.Arrays;

//2206 - Divide Array Into Equal Parts
//leetcode link:https://leetcode.com/problems/divide-array-into-equal-pairs/description/

public class leetcode2206 {
    public boolean divideArray(int[] nums) {
        if(nums.length % 2 != 0)return false;
        int count[] = new int[501];
        for(int n:nums){
            count[n]++;
        }
        for(int i = 1;i<count.length;i++){
            if(count[i] % 2 != 0){
                return false;
            }
        }
        return true;
    }
}
