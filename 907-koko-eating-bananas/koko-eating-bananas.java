class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maxPile(piles);

        while(low < high) {
            int mid = low + (high - low) / 2;

            long totalhours = calculateHour(piles,mid);

            if (totalhours <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private int maxPile(int[] piles) {
        int max = piles[0];
        for (int pile : piles) {
            max = Math.max(max , pile);
        }
        return max;
    }

    private long calculateHour(int[] piles, int k) {
        long hours = 0;
        for (int pile : piles) {
            hours +=(pile + k - 1) / k;
        }
        return hours;
    }
}