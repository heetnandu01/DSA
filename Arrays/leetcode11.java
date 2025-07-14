package DSA.Arrays;

//11- Container With Most Water
//leetcode link:https://leetcode.com/problems/container-with-most-water/description/

public class leetcode11 {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int width = right - left;
            int ht = Math.min(height[left], height[right]);
            int currWater = width * ht;
            maxWater = Math.max(maxWater, currWater);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
