/*
Complexities of Linear search 

Worst : O(n)	(Element is at the end or not present).
Average: O(n)	(Element is somewhere in the middle).
Best: O(1)	(Element is at the beginning of the array).
 */


public class linearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int target = 30;

        int result = linearSearch(nums, target);
        System.out.println(result != -1 ? "Found at index: " + result : "Not found");
    }
}
