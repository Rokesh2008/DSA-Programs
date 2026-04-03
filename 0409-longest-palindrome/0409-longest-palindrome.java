class Solution {
    public int longestPalindrome(String s) {
        // [A-Za-z] = 26 + 26
        int[] hits = new int[52];

        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if(c >= 'A' && c <= 'Z') {
                hits[c - 'A']++;
            } else {
                hits[c - 'a' + 26]++;
            }
        }

        boolean hasOdd = false;
        int len = 0;
        for(int i = 0; i < hits.length; i++) {

            if(hits[i] % 2 == 0) {
                len += hits[i];
            } else {
                len += (hits[i] - 1);
                hasOdd = true;
            }
        }

        return len + (hasOdd ? 1 : 0);
    }

}