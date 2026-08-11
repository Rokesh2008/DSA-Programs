class Solution {
    public int missingInteger(int[] nums) {
        
        int sum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1] + 1)
                sum += nums[i];
            else
                break;
        }

        HashSet<Integer> st = new HashSet<>();

        for(int num : nums)
            st.add(num);

        while(st.contains(sum))
            sum++;

        return sum;
    }
}