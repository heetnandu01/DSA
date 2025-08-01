package DSA.Arrays;

//2022 -Convert 1D Array Into 2D Array
//leetcode link: https://leetcode.com/problems/convert-1d-array-into-2d-array/description/

public class leetcode2022 {
      public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length) return new int [0][0];
        int [][] arr = new int[m][n];
        int idx=0;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                arr[i][j]=original[idx++];
            }
        }
        return arr;
    }
}
