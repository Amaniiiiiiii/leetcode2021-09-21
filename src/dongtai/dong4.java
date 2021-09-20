package dongtai;

public class dong4 {
    public int maxProfit(int[] price){
        //买卖股票
        int n = price.length;
        int[][] dp  = new int[n][n];

        int max = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int k =i+j;
                dp[j][k] = price[k] - price[j];
                if(dp[j][k]>max) max = dp[j][k];
            }
        }
        return max;
    }
}
