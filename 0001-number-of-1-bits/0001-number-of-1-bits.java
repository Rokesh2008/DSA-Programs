class Solution {
    public int hammingWeight(int n) {
        int x = 0;;
        while(n>=1){
            int re = n%2;
            n = n/2;
            if(re == 1){
                x++;
            }
        }
        return x;
    }
}