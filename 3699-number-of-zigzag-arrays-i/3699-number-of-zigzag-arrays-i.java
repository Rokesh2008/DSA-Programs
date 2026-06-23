class Solution {
    private static final int MOD = 1_000_000_007;
    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;
        long[] up = new long[m];
        long[] down = new long[m];
        for (int v = 0; v < m; v++) {
            down[v] = v;
            up[v] = m - 1 - v;
        }
        for (int len = 3; len <= n; len++) {
            long[] prefixUp = new long[m + 1];
            long[] prefixDown = new long[m + 1];
            for (int i = 0; i < m; i++) {
                prefixUp[i + 1] = (prefixUp[i] + up[i]) % MOD;
                prefixDown[i + 1] = (prefixDown[i] + down[i]) % MOD;
            }
            long totalDown = prefixDown[m];
            long[] newUp = new long[m];
            long[] newDown = new long[m];
            for (int v = 0; v < m; v++) {
                newDown[v] = prefixUp[v];
                newUp[v] = (totalDown - prefixDown[v + 1] + MOD) % MOD;
            }
            up = newUp;
            down = newDown;
        }
        long ans = 0;
        if (n == 2) {
            for (int i = 0; i < m; i++) {
                ans = (ans + up[i] + down[i]) % MOD;
            }
            return (int) ans;
        }
        for (int i = 0; i < m; i++) {
            ans = (ans + up[i] + down[i]) % MOD;
        }
        return (int) ans;
    }
}