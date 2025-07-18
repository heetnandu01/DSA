//2427 - Number of Common factors
//leetcode Link: https://leetcode.com/problems/number-of-common-factors/description/

public class leetcode2427 {
      public int commonFactors(int a, int b) {
        int count = 0;
        int min = Math.min(a,b);
        for(int i = 1;i <= min;i++){
            if(a % i == 0 && b % i == 0){
                count++;
            }
        }
        return count;
    }
}
