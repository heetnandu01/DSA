package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

//442 - Find All Duplicates in an Array
//leetcode link:https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

public class leetcode442 {
      public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int targetIndex = Math.abs(nums[i]) - 1;
            if (nums[targetIndex] < 0) {
                result.add(targetIndex + 1);
            } 
            nums[targetIndex] = -nums[targetIndex];
        }
        return result;
    }
}
