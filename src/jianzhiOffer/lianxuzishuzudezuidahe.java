package jianzhiOffer;

public class lianxuzishuzudezuidahe {
    public int FindGreatestSumOfSubArray(int[] array) {
        int[] dp = new int[array.length];
        int max = array[0];
        dp[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            dp[i] = dp[i-1] + array[i];
            if(dp[i]<array[i]) dp[i] = array[i];
            if(dp[i]>max) max = dp[i];
        }

        return max;
    }
}
