class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int cur = target.charAt(i) - 'a';

            if (freq[cur] > 0) {
                ans.append(target.charAt(i));
                freq[cur]--;
            } else {
                break;
            }
            if (i == n - 1) {
                ans.deleteCharAt(ans.length() - 1);
                freq[cur]++;
                return backtrack(ans, freq, target);
            }
        }
        return backtrack(ans, freq, target);
    }

    private String backtrack(StringBuilder ans, int[] freq, String target) {
        while (ans.length() >= 0) {
            int pos = ans.length();
            if (pos < target.length()) {
                int greater = target.charAt(pos) - 'a' + 1;
                for (int c = greater; c < 26; c++) {
                    if (freq[c] > 0) {
                        StringBuilder result = new StringBuilder(ans);
                        result.append((char) ('a' + c));
                        freq[c]--;
                        for (int j = 0; j < 26; j++) {
                            while (freq[j]-- > 0) {
                                result.append((char) ('a' + j));
                            }
                        }

                        return result.toString();
                    }
                }
            }

            if (ans.length() == 0) break;
            char removed = ans.charAt(ans.length() - 1);
            ans.deleteCharAt(ans.length() - 1);
            freq[removed - 'a']++;
        }

        return "";
    }
}