class Solution {
    public int uniquePathsWithObstacles(int[][] Grid) {
        int m = Grid.length;
        int n = Grid[0].length;
        int[][] dp = new int[m][n];
        
        // Fill the dp array with -1 to indicate unvisited cells
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        // Call the recursive function to solve the problem
        return solve(Grid, 0, 0, m, n, dp);
    }

    public int solve(int[][] Grid, int i, int j, int m, int n, int[][] dp) {
        // Base case: if we reach the bottom-right corner and it's not blocked, return 1
        if (i == m - 1 && j == n - 1 && Grid[i][j] == 0) {
            return 1;
        }
        
        // If out of bounds or there's an obstacle, return 0
        if (i >= m || j >= n || Grid[i][j] == 1) {
            return 0;
        }
        
        // If the result is already computed, return the memoized result
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        
        // Recursive calls to explore the right and down paths
        int sum1 = solve(Grid, i + 1, j, m, n, dp);
        int sum2 = solve(Grid, i, j + 1, m, n, dp);
        
        // Memoize the result and return
        return dp[i][j] = sum1 + sum2;
    }
}
