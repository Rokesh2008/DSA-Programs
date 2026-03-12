class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0],max = nums[0], len = nums.length;
        for(int i = 1;i<len;i++){
            sum = Math.max(nums[i], sum+nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
}