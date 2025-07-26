package DSA.Arrays;

//69 - Sqrt(x)
//leetcode link: https://leetcode.com/problems/sqrtx/description/

public class leetcode69 {
        public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int left = 1,right = x,ans = 0;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(mid <= x/mid){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return ans;
    }
}
