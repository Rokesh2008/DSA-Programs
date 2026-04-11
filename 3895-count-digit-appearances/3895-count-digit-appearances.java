class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int len = nums.length;
        int count = 0;
        for(int i = 0; i<len; i++){
            int val = nums[i];
            while(val>0){
                int temp = val%10;
                if(temp == digit)count++;
                val/=10;
            }
        }
        return count;
    }
}