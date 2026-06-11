class Solution {
    private static final int MOD = 1_000_000_007;
    public int rearrangeSticks(int n, int k) {
        long[] dp = new long[k+1];
        dp[0] = 1;
        for(int sticks=1; sticks<=n; sticks++){
            long[] next = new long[k+1];
            for(int visible = 1; visible <= Math.min(sticks, k); visible++){
                next[visible] = (dp[visible - 1] + (sticks -1L) * dp[visible]) % MOD;
            }
            dp = next;
        }
        return (int)dp[k];
    }
}