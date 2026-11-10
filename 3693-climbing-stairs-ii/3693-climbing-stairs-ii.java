class Solution {
    public int climbStairs(int n, int[] costs) {
        if (n <= 0) return 0;
        int[] dp = new int[n+1];
        for (int i = 0; i <= n; i++) {
            if(i==0){
                dp[i]=0;
            }
            else if(i==1){
                dp[i]=costs[i-1]+1+dp[i-1];
            }
            else if(i==2){
                dp[i] = Math.min(costs[i-1]+dp[i-1]+1,costs[i-1]+dp[i-2]+4);
            }
            else{
                dp[i] = Math.min(costs[i-1]+dp[i-1]+1,Math.min(costs[i-1]+4+dp[i-2],costs[i-1]+9+dp[i-3]));
            }
        }
        return dp[n];
    }
}