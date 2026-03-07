package LEETCODE;class Solution {
    public int Maximum(int[] piles) {
        int maxi = piles[0];
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > maxi) {
                maxi = piles[i];
            }
        }
        return maxi;
    }

    public long calculate(int[] piles, int mid) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + mid - 1) / mid;
        }
        return totalHours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Maximum(piles);
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long hours = calculate(piles, mid);

            if (hours <= (long)h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}

public class leetcode875 {
}
