class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0;
        int lasta = -1, lastb = -1, lastc = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a') lasta = i;
            else if (ch == 'b') lastb = i;
            else lastc = i;
            if (lasta != -1 && lastb != -1 && lastc != -1) {
                ans += Math.min(lasta, Math.min(lastb, lastc)) + 1;
            }
        }
        return ans;
    }
}