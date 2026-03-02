class Solution {
    public int path(int i, int j, int grid[][], int dp[][]){
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int ans = 1;
        int x = i;
        int y = j-1;
        if(y>=0 && grid[i][j]<grid[x][y]){
            ans = Math.max(ans, 1+path(x,y,grid,dp));
        }
        x = i+1;
        y = j;
        if(x<grid.length && grid[x][y]>grid[i][j]){
            ans = Math.max(ans, 1+path(x,y,grid,dp));
        }
        x = i-1;
        y = j;
        if(x>=0 && grid[i][j]<grid[x][y]){
            ans = Math.max(ans, 1+path(x,y,grid,dp));
        }
        x = i;
        y = j+1;
        if(y<grid[0].length && grid[x][y]>grid[i][j]){
            ans = Math.max(ans, 1+path(x,y,grid,dp));
        }
        return dp[i][j]=ans;
    }
    public int longestIncreasingPath(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        int count = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                int n = path(i,j,matrix,dp);
                count = Math.max(count, n);
            }
        }
        return count;
    }
}