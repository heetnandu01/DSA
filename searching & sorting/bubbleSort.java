/*
Complexities of Bubble Sort

Worst  : O(n^2)   (Array is in reverse order).
Average: O(n^2)   (Random order, typical case).
Best   : O(n)     (Array is already sorted — with optimized version).
*/

public class bubbleSort {
    public static void bubbleSort(int [] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){ 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {5,2,8,6,4};
        bubbleSort(arr);
        for(int num:arr){
            System.out.println(num + " ");
        }
    }
}


                
