class Solution {
    private int ans = 0;

    private long dfs(TreeNode node) {
        if (node == null) return 0L;

        long left = dfs(node.left);
        long right = dfs(node.right);

        int sum = (int)(left >>> 32) + (int)(right >>> 32) + node.val;
        int count = (int)(left & 0xFFFFFFFFL) + (int)(right & 0xFFFFFFFFL) + 1;

        if (node.val == (sum / count)) {
            ans++;
        }

        return ((long) sum << 32) | ((long) count & 0xFFFFFFFFL);
    }

    public int averageOfSubtree(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }
}