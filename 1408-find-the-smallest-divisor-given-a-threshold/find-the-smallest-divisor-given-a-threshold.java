class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = getMax(nums);

        while (low < high) {
            int mid = low + (high - low) / 2;
            int sum = calculateSum(nums, mid);

            if (sum <= threshold) {
                high = mid;
            } else {
                low = mid + 1;
            }
        } return low;
    }
    private int getMax(int[] nums) {
        int max = nums[0];

        for(int num : nums) {
            max = Math.max(max, num);
        } return max;
    }

    private int calculateSum(int[] nums, int divisor) {
        int sum = 0;

        for (int num : nums) {
            sum += (num + divisor - 1) / divisor;
        } return sum;
    }
}