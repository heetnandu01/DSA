package DSA.Arrays;

//1295 -Find Numbers with Even Number of Digits
//leetcode link : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/



public class leetcode1295 {
     public int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums){
            int digit = 0;
            while(num > 0){
                num = num /10;
                digit++;
            }
            if(digit % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
