package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

//2149 - Rearrange Array Elements by sign
//leetcode link:https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

public class leetcode2149 {
     public int[] rearrangeArray(int[] nums) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        int [] result = new int[nums.length];
        for(int num:nums){
            if(num > 0){
                positives.add(num);
            }else{
                negatives.add(num);
            }
        }
        int posIndex = 0;
        int negIndex = 0;
        for(int i = 0;i<nums.length;i++){
            if(i % 2 == 0){
                result[i] = positives.get(posIndex++);
            }else{
                result[i] = negatives.get(negIndex++);
            }
        }
        return result;
    }
}
