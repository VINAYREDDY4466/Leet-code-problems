class Solution {
    public boolean exist(char[][] board, String word) {
  int m = board.length;
        int n = board[0].length;
        
        // Iterate over every cell of the board to find the first character of the word
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Start DFS search if the first character matches
                if (board[i][j] == word.charAt(0)) {
                    if (checkexist(board, word, i, j, 0, m, n)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean checkexist(char[][] board, String word, int row, int col, int index, int m, int n) {
        // Base case: If we've checked all characters in the word
        if (index == word.length()) {
            return true;
        }

        // If out of bounds or character doesn't match or already visited
        if (row < 0 || col < 0 || row >= m || col >= n || board[row][col] != word.charAt(index)) {
            return false;
        }

        // Save the current character and mark the cell as visited
        char temp = board[row][col];
        board[row][col] = '!';  // Mark as visited

        // Recursively check all four directions (top, right, bottom, left)
        boolean found = checkexist(board, word, row - 1, col, index + 1, m, n) ||  // Top
                        checkexist(board, word, row, col + 1, index + 1, m, n) ||  // Right
                        checkexist(board, word, row + 1, col, index + 1, m, n) ||  // Bottom
                        checkexist(board, word, row, col - 1, index + 1, m, n);    // Left

        // Restore the original character after backtracking
        board[row][col] = temp;

        return found;
     }
}