class Solution {
    private String result = "";

    public String lexPalindromicPermutation(String s, String target) {
        int n = s.length();
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int odd = 0;
        int mid = -1;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                odd++;
                mid = i;
            }
        }
        if (odd > 1) return "";

        int[] halfFreq = new int[26];
        for (int i = 0; i < 26; i++) {
            halfFreq[i] = freq[i] / 2;
        }

        char[] half = new char[n / 2];
        if (dfs(0, false, halfFreq, half, mid, target)) {
            return result;
        }
        
        return "";
    }

    private boolean dfs(int idx, boolean isGreater, int[] halfFreq, char[] half, int mid, String target) {
        if (idx == half.length) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < half.length; i++) {
                sb.append(half[i]);
            }
            
            if (mid != -1) {
                sb.append((char) (mid + 'a'));
            }
            
            for (int i = half.length - 1; i >= 0; i--) {
                sb.append(half[i]);
            }

            String full = sb.toString();
            
            if (full.compareTo(target) > 0) {
                result = full;
                return true;
            }
            return false;
        }

        for (int i = 0; i < 26; i++) {
            if (halfFreq[i] > 0) {
                char c = (char) (i + 'a');
                
                if (!isGreater && c < target.charAt(idx)) {
                    continue;
                }

                halfFreq[i]--;
                half[idx] = c;
                
                if (dfs(idx + 1, isGreater || c > target.charAt(idx), halfFreq, half, mid, target)) {
                    return true;
                }
                
                halfFreq[i]++;
            }
        }
        return false;
    }
}