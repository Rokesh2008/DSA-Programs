class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones =0;
        for (char c :s.toCharArray()) {
            if (c =='1') {
                ones++;
            }
        }
        int prev = -1;
        int curr = 0;
        int maxi = 0;
        for(char c :s.toCharArray()) {
            if(c =='0') {
                curr++;
            } else if(curr != 0) {
                prev = curr;
                curr = 0;
            }
            if (prev > 0 && curr > 0) {
                maxi = Math.max(maxi, curr + prev);
            }
        }
        return ones + maxi;
    }
}