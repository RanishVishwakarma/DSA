class Solution {
    public int maxProduct(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int prefix = 1, sufix = 1;

        for (int i = 0;i<nums.length;i++) {

            prefix = prefix * nums[i];
            sufix = sufix * nums[nums.length-i-1];

            maxi = Math.max(maxi, Math.max(prefix, sufix));

            if (prefix == 0) prefix = 1;
            if (sufix == 0) sufix = 1;
        }
        return maxi;
    }
}