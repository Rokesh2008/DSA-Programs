class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        for(int i = 0; i<len; i++){
            for(int j = i+1; j<len; j++){
                if(Math.abs(i-j)>k)break;
                if((nums[i]==nums[j])){
                    if(Math.abs(i-j)<=k)return true;
                }
            }
        }
        return false;
    }
}