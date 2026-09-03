class Solution {
    int inf = (int) 1e9; 
    public boolean uniformArray(int[] nums1) {
        boolean odd = false, even = false; 
        int mn = inf; 
        for(int i = 0; i < nums1.length; i++) {
            if(nums1[i] % 2 == 0) even |= true; 
            else odd |= true; 
            mn = Math.min(mn, nums1[i]); 
        }
        if(!odd || !even) return true;
        return mn % 2 == 1; 
    }
}