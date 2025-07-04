package DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

//1 two sum
//leetcode link - https://leetcode.com/problems/two-sum/description/

public class leetcode1 {
     public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> num = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target  - nums[i];
            if(num.containsKey(complement)){
                return new int[] {num.get(complement),i};
            }else{
                num.put(nums[i], i);
            }
        }
        return new int[0]; 
    }
}

