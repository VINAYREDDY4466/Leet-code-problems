class Solution {
    public boolean checkvalid(char[][] board, int rows, int cols) {
        // Traverse each cell on the board
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Check if the current cell has a number
                if (board[i][j] != '.') {
                    // If the cell is invalid, return false immediately
                    if (!checkrow(board, i, j, rows, cols)) {
                        return false;
                    }
                }
            }
        }
        // If no invalid condition is found, return true
        return true;
    }

    public boolean checkrow(char[][] board, int row, int col, int rows, int cols) {
        char c = board[row][col];
        // Check the row and column
        for (int i = 0; i < cols; i++) {
            // Check for duplicate in the same row (excluding the current column)
            if (i != col && board[row][i] == c) {
                return false;
            }
            // Check for duplicate in the same column (excluding the current row)
            if (i != row && board[i][col] == c) {
                return false;
            }
        }

        // Check the 3x3 subgrid
        int subgridRowStart = 3 * (row / 3);
        int subgridColStart = 3 * (col / 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int currentRow = subgridRowStart + i;
                int currentCol = subgridColStart + j;
                if ((currentRow != row || currentCol != col) && board[currentRow][currentCol] == c) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        return checkvalid(board, rows, cols);
    }
}
