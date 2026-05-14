class Solution {

    public int minDays(int[] bloomDay, int m, int k) {

        // Not enough flowers
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int low = getMin(bloomDay);
        int high = getMax(bloomDay);

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canMake(int[] bloomDay, int m, int k, int day) {

        int bouquet = 0;
        int flower = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {
                flower++;
            } else {
                flower = 0;
            }

            if (flower == k) {
                bouquet++;
                flower = 0;
            }
        }

        return bouquet >= m;
    }

    private int getMin(int[] arr) {

        int min = Integer.MAX_VALUE;

        for (int num : arr) {
            min = Math.min(min, num);
        }

        return min;
    }

    private int getMax(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            max = Math.max(max, num);
        }

        return max;
    }
}