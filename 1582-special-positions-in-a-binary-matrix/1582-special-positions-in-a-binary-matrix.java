class Solution {
    public int numSpecial(int[][] mat) {
        int row = mat.length;
        int count = 0;
        int col = mat[0].length;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(mat[i][j]==1){
                    boolean isone = false;
                    for(int k = 0; k<row; k++){
                        if(mat[k][j] == 1 && k!=i){
                            isone = true;
                            break;
                        }
                    }
                    if(isone){
                        continue;
                    }
                    for(int k = 0; k<col; k++){
                        if(mat[i][k] == 1 && k!=j){
                            isone = true;
                            break;
                        }
                    }
                    if(isone){
                        continue;
                    }
                    count++;
                }
            }
        }
        return count;
    }
}