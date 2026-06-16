class Solution {
    public int trailingZeroes(int n) {
        int tenCount = 0, fiveCount = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                if (i % 10 == 0) tenCount += 1;
                int rem = (i % 10 == 0) ? i / 10 : i;
                while (rem % 5 == 0) {
                    rem /= 5;
                    fiveCount += 1;
                }
            }
        }
        return tenCount + fiveCount;
    }
}