package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

//448-Find All Numbers Disappeared in an Array
//leetcode link:https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

public class leetcode448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
