class Solution {
    private static final int MOD = 1_000_000_007;

    public int subsequencePairCount(int[] nums) {
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }
        int[][] dp = new int[maxVal + 1][maxVal + 1];
        dp[0][0] = 1; 

        for (int x : nums) {
            int[][] nextDp = new int[maxVal + 1][maxVal + 1];

            for (int g1 = 0; g1 <= maxVal; g1++) {
                for (int g2 = 0; g2 <= maxVal; g2++) {
                    if (dp[g1][g2] == 0) continue;
                    
                    int ways = dp[g1][g2];
                    int n1 = (g1 == 0) ? x : gcd(g1, x);
                    nextDp[n1][g2] = (nextDp[n1][g2] + ways) % MOD;
                    int n2 = (g2 == 0) ? x : gcd(g2, x);
                    nextDp[g1][n2] = (nextDp[g1][n2] + ways) % MOD;
                }
            }
            for (int g1 = 0; g1 <= maxVal; g1++) {
                for (int g2 = 0; g2 <= maxVal; g2++) {
                    dp[g1][g2] = (dp[g1][g2] + nextDp[g1][g2]) % MOD;
                }
            }
        }
        long totalWays = 0;
        for (int g = 1; g <= maxVal; g++) {
            totalWays = (totalWays + dp[g][g]) % MOD;
        }

        return (int) totalWays;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}