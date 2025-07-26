package DSA.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//229 - Majority Element II
//leetcode link: https://leetcode.com/problems/majority-element-ii/description/

public class leetcode229 {
     public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int threshold = nums.length / 3;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > threshold){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
