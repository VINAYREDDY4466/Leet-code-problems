class Solution {
    public int uniquePathsWithObstacles(int[][] Grid) {
        int m= Grid.length;
        int n= Grid[0].length;
        int[][] dp = new int[m][n];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        int ans= solve(Grid,0, 0, m,n,dp);
        return ans;
    }
    public int solve(int[][] Grid, int i, int j ,int m, int n, int[][] dp){
        if (i == m - 1 && j == n - 1 && Grid[i][j] == 0) {
            return 1;
        }
       if (i >= m || j >= n || Grid[i][j] == 1) {
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int sum1= solve(Grid, i+1, j, m, n, dp);
        int sum2= solve(Grid, i , j+1,m, n, dp);
        return dp[i][j]=sum1+sum2;
    }
}