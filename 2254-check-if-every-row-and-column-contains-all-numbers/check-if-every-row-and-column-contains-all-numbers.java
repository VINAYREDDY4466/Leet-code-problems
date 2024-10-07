class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;  // Since it's a square matrix, rows = cols = n
        
        // Check every row and every column
        for (int i = 0; i < n; i++) {
            if (!isValidRow(matrix, i, n) || !isValidCol(matrix, i, n)) {
                return false;
            }
        }
        return true;  // All rows and columns are valid
    }

    // Helper function to check if row `row` contains all numbers from 1 to n
    private boolean isValidRow(int[][] matrix, int row, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (matrix[row][i] < 1 || matrix[row][i] > n || !set.add(matrix[row][i])) {
                return false;
            }
        }
        return true;
    }

    // Helper function to check if column `col` contains all numbers from 1 to n
    private boolean isValidCol(int[][] matrix, int col, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (matrix[i][col] < 1 || matrix[i][col] > n || !set.add(matrix[i][col])) {
                return false;
            }
        }
        return true;
    }
}