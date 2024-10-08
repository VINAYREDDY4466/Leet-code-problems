class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        // Initialize the memoization array to store results for subproblems
        Integer[][][] dp = new Integer[m][n][k];  // m x n grid, with possible modulo values
        return solve(grid, 0, 0, m, n, k, 0, dp);
    }

    public int solve(int[][] grid, int i, int j, int m, int n, int k, int sum, Integer[][][] dp) {
        // Base case: if we reach the bottom-right corner
        if (i == m - 1 && j == n - 1) {
            sum += grid[i][j];
            // If the sum modulo k is 0, we found a valid path
            return (sum % k == 0) ? 1 : 0;
        }

        // If we're out of bounds, return 0
        if (i >= m || j >= n) {
            return 0;
        }

        // Take the current cell's value into the running sum
        sum += grid[i][j];
        sum %= k;  // Keep the sum modulo k to avoid overflow

        // Check if we already computed this state
        if (dp[i][j][sum] != null) {
            return dp[i][j][sum];
        }

        // Recursively go down and right in the grid
        int down = solve(grid, i + 1, j, m, n, k, sum, dp);
        int right = solve(grid, i, j + 1, m, n, k, sum, dp);

        // Store the result in dp array and return it
        return dp[i][j][sum] = (down + right) % 1000000007;  // Modulo 1e9+7 to handle large results
    }
}
