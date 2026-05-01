class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Make mid even
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;   // single element on right
            } else {
                high = mid;      // single element on left (including mid)
            }
        }
        return nums[low];
    }
}