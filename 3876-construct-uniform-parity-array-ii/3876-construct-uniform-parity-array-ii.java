class Solution {
    public boolean uniformArray(int[] nums1) {
        int min_odd = Integer.MAX_VALUE;
        int min_even = Integer.MAX_VALUE;
        int len= nums1.length;
        for(int i = 0; i<len; i++){
            if(nums1[i]%2!=0){
                min_odd = Math.min(min_odd, nums1[i]);
                
            }
            else{
                min_even = Math.min(min_even, nums1[i]);
            }
        }
        if((min_odd == Integer.MAX_VALUE) || (min_even == Integer.MAX_VALUE)){
            return true;
        }
        if(min_odd<min_even){
            return true;
        }
        return false;
    }
}