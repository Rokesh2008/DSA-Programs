class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long[] len = new long[n];

        long cur = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                cur++;
            } else if (c == '*') {
                cur = Math.max(0, cur - 1);
            } else if (c == '#') {
                cur *= 2;
            }

            len[i] = cur;
        }

        if (k >= cur) return '.';

        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                if (len[i] - 1 == k) {
                    return c;
                }
            }
            else if (c == '#') {
                k %= (len[i] / 2);
            }
            else if (c == '%') {
                k = len[i] - 1 - k;
            }
        }

        return '.';
    }
}