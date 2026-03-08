package LEETCODE;class Solution {

    public int Minimum(int[] bloomDay) {
        int mini = bloomDay[0];
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] < mini) {
                mini = bloomDay[i];
            }
        }
        return mini;
    }

    public int Maximum(int[] bloomDay) {
        int maxi = bloomDay[0];
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] > maxi) {
                maxi = bloomDay[i];
            }
        }
        return maxi;
    }

    public boolean isPossible(int[]bloomDay,int m,int k,int mid)
    {   int n = bloomDay.length;
        int count =0;
        int boq=0;
        for(int i =0;i<n;i++)
        {
            if(mid>=bloomDay[i]) count ++;
            else{
                boq+=count/k;
                count=0;
            }
        }
        boq+=count/k;
        if(boq>=m) return true;
        else return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int low = Minimum(bloomDay);
        int high = Maximum(bloomDay);
        int ans = -1;
        if (m * k > n)
            return -1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (isPossible(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}

public class leetcode1482 {
}
