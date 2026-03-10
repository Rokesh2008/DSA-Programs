class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int l,max = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i)==')'){
                max++;
                break;
            }
        }
        if(max==0){
            return 0;
        }
        max=0;
        for(int i = 0; i < n; i++) {
            int open = 0, close = 0;
            for(int j = i; j < n; j++) {
                if(s.charAt(j) == '(')
                    open++;
                else
                    close++;
                if(close > open)
                    break;
                if(open == close) {
                    l = 2 * close;
                    if(l > max)
                        max = l;
                }
            }
        }
        return max;
    }
}