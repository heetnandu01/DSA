//Linear search

//1364 - Check If N and Its Double Exist
//leetcode link:https://leetcode.com/problems/check-if-n-and-its-double-exist/description/


public class leetcode1346 {
    public boolean checkIfExist(int[] arr) {
        int current = 0;
        for(int i = 0;i < arr.length;i++){
            current = arr[i];
            for(int j = 0;j < arr.length;j++){
                if(i == j){
                    continue;
                }else if(arr[j] == 2 * current){
                    return true;
                }
            }
        }
        return false;
    }
}
