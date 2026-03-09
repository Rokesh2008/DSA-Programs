class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int index = 0;
        for(int i : nums){
            if(i!=index){
                return index;
            }
            index++;
        }
        return index;
    }
}