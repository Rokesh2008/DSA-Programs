class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] count = new int[51];
        for (int i = 0; i <= nums.length - k; i++){
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < i + k; j++){
                set.add(nums[j]);
            }
            for (int x : set){
                count[x]++;
            }
        }
        int ans = -1;
        for (int x = 0; x<=50;x++){
            if (count[x]==1){
                ans = x;
            }
        }
        return ans;
    }
}