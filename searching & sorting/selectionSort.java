/*
Complexities of Selection Sort

Worst  : O(n^2)   (No matter the initial order, comparisons are always n(n-1)/2).
Average: O(n^2)   (Typical case, still makes same number of comparisons).
Best   : O(n^2)   (Even if already sorted, still does full comparisons).
*/


public class selectionSort {
    public static void selectionSort(int [] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {3,9,7,4,1};
        selectionSort(arr);
        for(int num:arr){
            System.out.println(num + " ");
        }
    }
}




