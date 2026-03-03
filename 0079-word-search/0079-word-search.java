class Solution {
    boolean check(char[][] board, String word, int i, int j, int index, boolean[][] visited){
        if(index == word.length()) return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length){
            return false;
        }
        if(visited[i][j] || board[i][j] != word.charAt(index)){
            return false;
        }
        visited[i][j] = true;
        if(check(board, word, i+1, j, index+1, visited) ||
           check(board, word, i-1, j, index+1, visited) ||
           check(board, word, i, j+1, index+1, visited) ||
           check(board, word, i, j-1, index+1, visited)){
            return true;
        }
        visited[i][j] = false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i<board.length;i++){
            for(int j = 0; j<board[0].length;j++){
                boolean visited[][] = new boolean[board.length][board[0].length];
                int index = 0;
                if(check(board, word, i, j, index, visited)){
                    return true;
                }
            }
        }
        return false;
    }
}