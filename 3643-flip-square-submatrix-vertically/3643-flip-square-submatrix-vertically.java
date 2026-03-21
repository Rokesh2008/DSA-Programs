class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int startrow=x;
        int endrow=x+k-1;
       while(startrow<endrow){
        for(int i=y;i<y+k;i++){
            int temp=grid[startrow][i];
            grid[startrow][i]=grid[endrow][i];
            grid[endrow][i]=temp;
        }
        startrow++;
        endrow--;
       }
       return grid;
    }
}