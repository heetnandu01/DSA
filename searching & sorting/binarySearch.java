public class binarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20, 25, 30, 35, 40};
        int target = 20;

        int result = binarySearch(nums, target);
        System.out.println(result != -1 ? "Found at index: " + result : "Not Found");
    }
}
