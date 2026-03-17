class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[]rf= new boolean[n];
        boolean[]cf= new boolean[n];
        boolean []d1f = new boolean[(2*n)-1];
        boolean []d2f = new boolean[(2*n)-1];

        char [][]mat = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(mat[i],'.');
        }
        List<List<String>> ans = new ArrayList<>();
        find(mat,rf,cf,d1f,d2f,n,0,ans);
       return ans;
    }
    public void find(char[][]mat , boolean[]rf,boolean[]cf,boolean[]d1f,boolean[]d2f,int n,int row, List<List<String>> ans ){
        if(row==n) {
            List<String>cur=new ArrayList<>();
            for(int i=0;i<n;i++){
                cur.add(new String(mat[i]));
            }
            ans.add(cur);
            return;
        }
        for(int i=0;i<n;i++){
              if(!rf[row] && !cf[i] && !d1f[row+i] && !d2f[n-1-row+i]){
                    mat[row][i]='Q';
                    rf[row]=true;
                    cf[i]=true;
                    d1f[row+i]=true;
                    d2f[n-1-row+i]=true;

                    find(mat,rf,cf,d1f,d2f,n,row+1,ans);
                    mat[row][i]='.';
                    rf[row]=false;;
                    cf[i]=false;
                    d1f[row+i]=false;
                    d2f[n-1-row+i]=false; 
              }
        }
    
    }
}