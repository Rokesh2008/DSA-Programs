class Solution {
    public int smallestEqual(int[] nums) {
        int len = nums.length;
        for(int i = 0; i<len; i++){
            if(i%10 == nums[i]){
                return i;
            }
        }
        return -1;
    }
}