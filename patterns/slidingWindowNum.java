package DSA.patterns;

public class slidingWindowNum{
        public int maxEvens(int[] nums, int k) {
        int count = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEven(nums[i]))
                count++;
            if (i >= k && isEven(nums[i - k]))
                count--;
            max = Math.max(max, count);
        }
        return max;
    }

    private boolean isEven(int num) {
        return num % 2 == 0;
    }
}
