import java.util.*;
class Solution {
    class TrieNode {
        TrieNode[] child = new TrieNode[26];
        String word;
    }
    TrieNode root = new TrieNode();
    List<String> ans = new ArrayList<>();
    public List<String> findWords(char[][] board, String[] words) {
        for (String word : words) {
            insert(word);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root);
            }
        }
        return ans;
    }
    void insert(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()){
            int index = c - 'a';
            if (curr.child[index] == null) {
                curr.child[index] = new TrieNode();
            }
            curr = curr.child[index];
        }
        curr.word = word;
    }
    void dfs(char[][] board, int r, int c, TrieNode node) {
        if (r < 0 || r >= board.length ||
            c < 0 || c >= board[0].length) {
            return;
        }
        if (board[r][c] == '#') {
            return;
        }
        char ch = board[r][c];
        int index = ch - 'a';
        if (node.child[index] == null) {
            return;
        }
        TrieNode next = node.child[index];
        if (next.word != null) {
            ans.add(next.word);
            next.word = null;
        }
        board[r][c] = '#';
        dfs(board, r + 1, c, next);
        dfs(board, r - 1, c, next);
        dfs(board, r, c + 1, next);
        dfs(board, r, c - 1, next);
        board[r][c] = ch;
    }
}