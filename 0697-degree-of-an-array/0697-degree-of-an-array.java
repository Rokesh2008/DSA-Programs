class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int deg = 1;
        int minlen = nums.length;
        for(int i = 0; i<nums.length; i++){
            if(!first.containsKey(nums[i])){
                first.put(nums[i], i);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i])>deg){
                minlen = i- first.get(nums[i])+1;
                deg = map.get(nums[i]);
            }
            if(map.get(nums[i]) == deg){
                minlen = Math.min(minlen, i - first.get(nums[i])+1);

            }
        }
        return minlen;
    }
}