class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length-1;
        int l = 0, r = len;
        while(l<r){
            int mid = (l+r)/2;
            if(nums[mid]<target){
                l = mid+1;
            }
            else{
                r = mid;
            }
        }
        return (nums[l]==target)?l:-1;
    }
}