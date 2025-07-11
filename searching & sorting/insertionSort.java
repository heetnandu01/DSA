/*
Complexities of Insertion Sort

Worst  : O(n^2)   (Array is in reverse order — every new element is compared with all previous ones).
Average: O(n^2)   (Elements are in random order — roughly half of the elements need shifting).
Best   : O(n)     (Array is already sorted — only one comparison per element, no shifting).
*/

public class insertionSort {
    public static void insertionSort(int [] arr){
        int n = arr.length;
        for(int i = 0;i < n;i++){
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int [] arr = {3,2,5,7,6,8,4};
        insertionSort(arr);
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
             


