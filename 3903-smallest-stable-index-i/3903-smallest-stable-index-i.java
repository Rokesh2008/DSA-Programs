class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] preffixMax = new int[n];
        int[] suffixMin = new int[n];
        preffixMax[0] = nums[0];
        suffixMin[n-1] = nums[n-1]; 
        for(int i  = 1 , j = n  - 2 ; i  < n ; ++i , --j){
            preffixMax[i] = Math.max(preffixMax[i-1],nums[i]);
            suffixMin[j] = Math.min(suffixMin[j+1],nums[j]);
        }
        int smallestStableIndex = -1;
        for(int i = 0 ; i < n ; ++i){
            int stableScore = preffixMax[i] - suffixMin[i];
            if(stableScore <= k){
                smallestStableIndex = i;
                break;
            }
        }
        return smallestStableIndex;
    }
}