class Solution {
    public int diagonalSum(int[][] mat) {
                int n = mat.length;
        int sum = 0;
        
        // Summing the primary diagonal and the secondary diagonal
        for (int i = 0; i < n; i++) {
            sum += mat[i][i]; // Primary diagonal
            sum += mat[i][n - 1 - i]; // Secondary diagonal
        }
        
        // If the matrix has an odd size, subtract the center element which was added twice
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        
        return sum;


    }
}