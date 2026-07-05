class Solution {
    class Pair {
        int score;
        int ways;
        Pair(int score, int ways) {
            this.score = score;
            this.ways = ways;
        }
    }
    int[][] dir = {{0,-1},{-1,0},{-1,-1}};
    Pair[][] memo;
    List<String> board;
    int n;
    int MOD = 1_000_000_007;
    public int[] pathsWithMaxScore(List<String> board) {
        this.board = board;
        n = board.size();
        memo = new Pair[n][n];
        Pair ans = solve(n - 1, n - 1);
        if (ans.ways == 0)
            return new int[]{0, 0};
        return new int[]{ans.score, ans.ways};
    }
    Pair solve(int i, int j) {
        if (i < 0 || j < 0)
            return new Pair(Integer.MIN_VALUE, 0);

        char ch = board.get(i).charAt(j);
        if (ch == 'X')
            return new Pair(Integer.MIN_VALUE, 0);

        if (i == 0 && j == 0)
            return new Pair(0, 1);

        if (memo[i][j] != null)
            return memo[i][j];

        int best = Integer.MIN_VALUE;
        int ways = 0;
        for (int[] d : dir) {
            Pair next = solve(i + d[0], j + d[1]);
            if (next.ways == 0)
                continue;
            if (next.score > best) {
                best = next.score;
                ways = next.ways;
            } else if (next.score == best) {
                ways = (ways + next.ways) % MOD;
            }
        }
        if (ways == 0)
            return memo[i][j] = new Pair(Integer.MIN_VALUE, 0);
        int val = 0;
        if (ch >= '1' && ch <= '9')
            val = ch - '0';
        return memo[i][j] = new Pair(best + val, ways);
    }
}