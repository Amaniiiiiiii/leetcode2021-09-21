package dongtai;

public class dong1 {
    public static void main(String[] args) {

    }

    public String longestPalindrome(String s){
        String ans = "";
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        //i代表不同长度的字符串

        for (int i = 0; i < n; i++) {
            //j代表对 一个定长的字符串 起始的索引 k代表结束的索引
            for (int j = 0; j < n - i; j++) {
                int k = i+j;
                if(i==0){
                    dp[j][k] = true;
                }else if(i==1){
                    dp[j][k] = (s.charAt(j) == s.charAt(k));
                }else if(i>1){
                    dp[j][k] = (s.charAt(j)==s.charAt(k) && dp[j+1][k-1]);
                }
                if(dp[j][k] && i+1 > ans.length()){
                    ans = s.substring(j,k+1);
                }
            }
        }
        return ans;
    }
}
