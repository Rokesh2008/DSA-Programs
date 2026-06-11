class Solution {
    static final long MOD = 1_000_000_007L;
    int[][] g;

    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;

        int[] deg = new int[n + 1];
        for (int[] e : edges) {
            deg[e[0]]++;
            deg[e[1]]++;
        }

        g = new int[n + 1][];
        for (int i = 1; i <= n; i++) {
            g[i] = new int[deg[i]];
        }

        int[] idx = new int[n + 1];
        for (int[] e : edges) {
            g[e[0]][idx[e[0]]++] = e[1];
            g[e[1]][idx[e[1]]++] = e[0];
        }

        int depth = dfs(1, 0);

        return (int) modPow(2, depth - 1);
    }

    private int dfs(int u, int parent) {
        int maxDepth = 0;

        for (int v : g[u]) {
            if (v != parent) {
                int d = dfs(v, u) + 1;
                if (d > maxDepth) maxDepth = d;
            }
        }

        return maxDepth;
    }

    private long modPow(long a, long b) {
        long res = 1;

        while (b > 0) {
            if ((b & 1) != 0)
                res = res * a % MOD;

            a = a * a % MOD;
            b >>= 1;
        }

        return res;
    }
}