package DSA.Arrays;

//42 - Trapping Rain Water
//leetcode link:https://leetcode.com/problems/trapping-rain-water/description/

public class leetcode42 {
     public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        int left = 0,right = n-1;
        int lmax = 0,rmax = 0;
        while(left < right){
            lmax = Math.max(lmax,height[left]);
            rmax = Math.max(rmax,height[right]);
            if(lmax < rmax){
                ans += lmax - height[left];
                left++;
            }else{
                ans += rmax - height[right];
                right--;
            }
        } 
        return ans;
    }
}
