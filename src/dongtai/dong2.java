package dongtai;

public class dong2 {
    public int maxSubArray(int[] nums){
        if(nums.length==1) return nums[0];
        int[][] dp = new int[nums.length][nums.length];
        int max = Integer.MIN_VALUE;
        //i代表的是索引差值 长度 = 索引差值+1
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                int k = i+j;
                if(i==0){
                    dp[j][k] = nums[j];
                }else if(i>0){
                    dp[j][k] = dp[j+1][k] + nums[j];
                }
                if(dp[j][k]>max)
                    max = dp[j][k];
            }
        }
        return max;
    }

    public int maxSubArray1(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre+nums[i],nums[i]);
            maxAns = Math.max(maxAns,pre);
        }
        return maxAns;
    }

}
