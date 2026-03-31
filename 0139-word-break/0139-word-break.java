class Solution {
    private static boolean Solve(int st, int end, String s, List<String> word, Boolean dp[]) {
        if (st == end) {
            return true;
        }
        if (dp[st] != null) {
            return dp[st];
        }
        for (String s1 : word) {
            if (st + s1.length() <= end && s.startsWith(s1, st)) {
                if (Solve(st + s1.length(), end, s, word, dp)) {
                    return dp[st] = true;
                }
            }
        }
        return dp[st] = false;
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        Boolean dp[] = new Boolean[s.length()];
        return Solve(0, s.length(), s, wordDict, dp);
    }
}