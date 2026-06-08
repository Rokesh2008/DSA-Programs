class Solution {
    public int[] shuffle(int[] nums, int n) {
        int index = 0;
        int[] lst = new int[2*n];
        for(int i = 0; i<n; i++){
            lst[index] = nums[i];
            lst[index+1] = nums[i+n];
            index+=2;
        }
        return lst;
    }
}