class Solution {
    String str = "";
    int[][][] dp;
    public int countDigitOne(int n) {
        str = String.valueOf(n);
        int len = str.length() + 1;
        dp = new int[len][2][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < len; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return dp_Fun(0, 1, 0);
    }
    public int dp_Fun(int idx, int tight, int count) {
        if (idx == str.length()) {
            return count;
        }
        if (dp[idx][tight][count] != -1) {
            return dp[idx][tight][count];
        }
        int ans = 0;
        int ub = (tight == 1) ? str.charAt(idx) - '0' : 9;
        for (int i = 0; i <= ub; i++) {
            int next_tight = (tight == 1 && i == ub) ? 1 : 0;
            if (i == 1) {
                ans += dp_Fun(idx + 1, next_tight, count + 1);
            } else {
                ans += dp_Fun(idx + 1, next_tight, count);
            }
        }
        return dp[idx][tight][count] = ans;
    }
}