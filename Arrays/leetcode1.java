package DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

//1 two sum
//leetcode link - https://leetcode.com/problems/two-sum/description/

public class leetcode1 {
     public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hash = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int comp = target -nums[i];
            if(hash.containsKey(comp)){
                return new int []{hash.get(comp),i};
            }
            hash.put(nums[i],i);
        }
        return new int []{};
    }
}

