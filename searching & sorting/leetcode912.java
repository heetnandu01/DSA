//Bubble sort

//912 - Sort an Array
//leetcode link:https://leetcode.com/problems/sort-an-array/description/


public class leetcode912 {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    private void mergeSort(int[] nums, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }
    private void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= high) {
            temp[k++] = nums[j++];
        }

        for (int p = 0; p < temp.length; p++) {
            nums[low + p] = temp[p];
        }
    }
}
