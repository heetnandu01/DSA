// Binary search problem

//35. Search Insert Position
//leetcode link:https://leetcode.com/problems/search-insert-position/description/

public class leetcode35 {
     public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
}

