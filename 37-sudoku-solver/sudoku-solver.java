class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);  // Call the helper function
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {  // Try digits '1' to '9'
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;  // Place the character
                            if (solve(board)) {
                                return true;  // If the board is solved, return true
                            } else {
                                board[i][j] = '.';  // Backtrack
                            }
                        }
                    }
                    return false;  // No valid solution, backtrack
                }
            }
        }
        return true;  // The board is solved
    }

    private boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            // Check the row
            if (board[row][i] == c) return false;
            // Check the column
            if (board[i][col] == c) return false;
            // Check the 3x3 sub-box
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false;
        }
        return true;
    }
}
