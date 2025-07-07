package DSA.Arrays;

import java.util.HashMap;

//560.Subarray Sum Equals K
//leetcode link:https://leetcode.com/problems/subarray-sum-equals-k/description/
public class leetcode560 {
      public int subarraySum(int[] nums, int k) {
        int currentSum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            currentSum += num;
            if(map.containsKey(currentSum - k)){
                count += map.get(currentSum - k);
            }
            map.put(currentSum,map.getOrDefault(currentSum,0) + 1);
        }
        return count;
    }
}
