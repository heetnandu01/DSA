package DSA.Arrays;

import java.util.Arrays;

//1051 - Height Checker
//leetcode link:https://leetcode.com/problems/height-checker/description/

public class leetcode1051 {
        public int heightChecker(int[] heights) {
        int[] sorted = heights.clone();
        Arrays.sort(sorted);
        int count  = 0;
        for(int i = 0;i<heights.length;i++){
            if(heights[i] != sorted[i]){
                count++;
            }
        }
        return count;
    }
}
