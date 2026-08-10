class Solution {
    int[] dp;
    public int helper(int n) {
        if(dp[n]!=-1) return dp[n];
        int root=(int)Math.sqrt(n);
        for(int i=root;root>=1;root--){
            int square=root*root;
            if(n-square==0 || helper(n-square)==0) return dp[n]=1;
        }
        return dp[n]=0;
    }
    public boolean winnerSquareGame(int n){
        this.dp=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n)==1;
    }
}