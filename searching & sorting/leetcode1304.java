// linear search problem

//1304 - Find N Unique Integers Sum up to Zero
//leetcode link:https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/

public class leetcode1304 {
     public int[] sumZero(int n) {
        int index = 0;
        int [] result = new int[n];
        for(int i =1;i <= n/2; i++){
            result[index++] = i;
            result[index++] = -i;
        }
        if(n % 2 != 0){
            result[index] = 0;
        }
        return result;
    }
}