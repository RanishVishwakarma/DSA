class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];

        int n = nums1.length, m = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < n) {
            merged[k++] = nums1[i++];
        }
        while (j < m) {
            merged[k++] =nums2[j++];
        }

        int len = m + n;

        if (len % 2 == 1) {
            return merged[len / 2];
        } 
        return (merged[len/2 - 1] + merged[len / 2]) / 2.0;
    }
}