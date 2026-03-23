class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int row = mat.length;
        int col = mat[0].length;
        for(int n = 0; n<4; n++){
            int[][] temp = new int[row][col];
            for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
                    temp[i][j] = mat[row - j - 1][i];
                }
            }
            boolean ans = true;
            for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
                    if(temp[i][j] != target[i][j]){
                        ans = false;
                    }
                }
            }
            if(ans == true){
                return true;
            }
            mat = temp;
        }
        return false;
    }
}