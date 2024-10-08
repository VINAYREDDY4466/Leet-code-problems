class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        // Initialize dp array with -1 to indicate uncomputed values
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(grid, 0, 0, m, n, dp);
    }

    public int solve(int[][] grid, int i, int j, int m, int n, int[][] dp) {
        // Base case: If we reach the bottom-right corner, return the cell's value
        if (i == m - 1 && j == n - 1) {
            return grid[i][j];
        }

        // If out of bounds, return a large number to signify invalid path
        if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
        }

        // If already computed, return the stored value
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // Recursive calls: Move down and right, and choose the minimum path
        int down = solve(grid, i + 1, j, m, n, dp);
        int right = solve(grid, i, j + 1, m, n, dp);

        // Store the result in dp array and return it
        dp[i][j] = grid[i][j] + Math.min(down, right);
        return dp[i][j];
    }
}
