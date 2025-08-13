package DSA.Arrays;

// 1550 - Three Consecutive Odds
// leetcode link:https://leetcode.com/problems/three-consecutive-odds/description/

public class leetcode1550 {
     public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            if (isOdd(arr[i]) && isOdd(arr[i + 1]) && isOdd(arr[i + 2])) {
                return true;
            }
        }
        return false;
    }
    private boolean isOdd(int n) {
        return n % 2 != 0;
    }
}
