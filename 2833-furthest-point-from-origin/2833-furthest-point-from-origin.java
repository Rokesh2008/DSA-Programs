class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0, r = 0, x = 0;
        for(char ch: moves.toCharArray()){
            if(ch == 'L'){
                l++;
            }
            else if(ch == 'R'){
                r++;
            }
            else{
                x++;
            }
        }
        int ans = Math.abs(l-r)+x;
        return ans;
    }
}