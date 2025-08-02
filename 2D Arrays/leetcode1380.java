
//1389 -Lucky Numbers in a Matrix
//leetcode link:https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/

import java.util.ArrayList;
import java.util.List;

public class leetcode1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
       int n = matrix.length;
       int m = matrix[0].length;
       List<Integer> list = new ArrayList<>();
       for(int i =0;i<n;i++){
          int  min = matrix[i][0];
          int col=0;
          for(int j=0;j<m;j++){
            if(matrix[i][j]<min){
                min=matrix[i][j];
                col=j;
            }
          }
         boolean isMaxcol = true;
         for(int k=0;k<n;k++){
            if(matrix[k][col]>min){
               isMaxcol = false;
                break;
            }
         }
         if(isMaxcol){
            list.add(min);
         }

       }
       return list;
     }
}
