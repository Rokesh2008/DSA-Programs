class Solution {
    public int pivotInteger(int n) {
        int ans = 0;
        for(int i = 1; i<=n; i++){
            ans+=i;
        }
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum+=i;
            if(ans - sum + i == sum)return i;
        }
        return -1;
    }
}