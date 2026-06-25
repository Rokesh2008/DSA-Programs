class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int tarCount = 0;
            int otherCount = 0;
            for (int j = i; j < n; j++) {
                if (target == nums[j]) {
                    tarCount += 1;
                } else {
                    otherCount += 1;
                }
                if (tarCount > otherCount) {
                    ans += 1;
                }

            }
        }
        return ans;
    }
}