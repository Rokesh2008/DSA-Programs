class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        char [] row = new char[n];
        char [] diag1 = new char[2*n];
        char [] diag2 = new char[2*n];
        func(0,n,row,diag1,diag2);
        return count;
    }
    public void func(int ind, int n, char[] row, char[]diag1, char[]diag2)
    {
        if(ind == n)
        {
            count++;
            return;
        }
        for(int i=0; i<n; i++)
        {
            if(row[i] != 'Q' && diag1[i+ind] != 'Q' && diag2[ind - i + n] != 'Q')
            {
                row[i] = 'Q';
                diag1[i+ind] = 'Q';
                diag2[ind - i + n] = 'Q';

                func(ind+1, n,row,diag1,diag2);
                row[i] = '\0';
                diag1[i+ind] = '\0';
                diag2[ind - i + n] = '\0';
            }
        }
    }
}