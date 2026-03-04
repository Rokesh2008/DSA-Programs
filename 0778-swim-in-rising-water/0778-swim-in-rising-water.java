class Solution {
    private PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[2] - b[2]);
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        heap.offer(new int[]{0, 0, grid[0][0]});
        int time = 0;
        while(!heap.isEmpty()){
            int[] cell = heap.poll();
            int x = cell[0];
            int y = cell[1];
            time = Math.max(time, cell[2]);
            if(x == n-1 && y == n-1) return time;
            visited[x][y] = true;
            if(x+1 < n && !visited[x+1][y]){
                heap.offer(new int[]{x+1, y, grid[x+1][y]});
            }
            if(x-1 >= 0 && !visited[x-1][y]){
                heap.offer(new int[]{x-1, y, grid[x-1][y]});
            }
            if(y+1 < n && !visited[x][y+1]){
                heap.offer(new int[]{x, y+1, grid[x][y+1]});
            }
            if(y-1 >= 0 && !visited[x][y-1]){
                heap.offer(new int[]{x, y-1, grid[x][y-1]});
            }
        }
        return time;
    }
}