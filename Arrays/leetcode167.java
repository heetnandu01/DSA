package DSA.Arrays;

//167:Two Sum II - Input Array Is Sorted
//leetcode link:https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

public class leetcode167 {
     public int[] twoSum(int[] numbers, int target) {
        int left = 0,right = numbers.length - 1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int [] {left + 1, right + 1};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int []  {-1 ,1};
    }
}
