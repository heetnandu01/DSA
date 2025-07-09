
//9.palindrome Number
//leetcode link:https://leetcode.com/problems/palindrome-number/


public class leetcode9 {
     public boolean isPalindrome(int x) {
        int originalNum = x;
        int rev = 0;
        if(x < 0){
            return false;
        }
           while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return rev == originalNum;
    }    
}
