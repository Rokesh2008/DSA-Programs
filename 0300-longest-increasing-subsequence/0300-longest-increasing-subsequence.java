class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length, count = 1;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        for(int i = 1; i<len; i++){
            for(int j = 0; j<i; j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            count = Math.max(count, dp[i]);
        }
        return count;
    }
}