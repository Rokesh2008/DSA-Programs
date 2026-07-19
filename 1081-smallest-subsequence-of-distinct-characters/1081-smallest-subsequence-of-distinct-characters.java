class Solution {
    public String smallestSubsequence(String s) {
        int[] lastIdx = new int[26];
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            int idx = (int) (ch - 'a');
            lastIdx[idx] = i;
        }
        boolean[] present = new boolean[26];
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            int idx = (int) (ch - 'a');
            if(present[idx] == false) {
                while(st.size() > 0 && st.peek() > ch && lastIdx[st.peek() - 'a'] > i) {
                    present[st.peek() - 'a'] = false;
                    st.pop();
                }

                st.push(ch);
                present[idx] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(st.size() > 0) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
} 