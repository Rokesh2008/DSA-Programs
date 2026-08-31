class Solution {
    public boolean predictTheWinner(int[] nums) {
        return solve(0, nums.length - 1, nums, 0, 0, true);
    }

    public boolean solve(int i, int j, int[] arr, int p1s, int p2s, boolean p1Turn) {

        if (i > j) {
            return p1s >= p2s;
        }

        if (p1Turn) {
            return solve(i + 1, j, arr, p1s + arr[i], p2s, false)
                || solve(i, j - 1, arr, p1s + arr[j], p2s, false);
        } else {
            return solve(i + 1, j, arr, p1s, p2s + arr[i], true)
                && solve(i, j - 1, arr, p1s, p2s + arr[j], true);
        }
    }
}