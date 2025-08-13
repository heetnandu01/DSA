package DSA.MathandRecursion;

// 2894 - Divisible and Non-divisible Sums Difference
// leetcode link:https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/

public class leetcode2894 {
    public int differenceOfSums(int n, int m) {
        int sumA = 0;
        int sumB = 0;
        for(int i = 1;i<=n;i++){
            if(i % m == 0){
                sumB += i;
            }else{
                sumA += i;
            }
        }
        return sumA - sumB;
    }
}

