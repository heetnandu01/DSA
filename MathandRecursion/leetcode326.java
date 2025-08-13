package DSA.MathandRecursion;

// 326 - power of three
// leetcode link:https://leetcode.com/problems/power-of-three/description/

public class leetcode326 {
     public boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
        while(n%3 == 0){
            n /= 3;
        }
        if(n == 1){
            return true;
        }
        return false;
    }
}
