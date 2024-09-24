// Buy and Sell Stock Pattern
// Approach - 1 Memorization


class Solution {
    public int maxProfit(int[] arr) {
       int n=arr.length;
        int[][][] dp = new int[n][2][3];
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        int ans = solve(arr, 0, 0, n, 2,dp);
        return ans;
    }
    public int solve(int[]arr, int buy, int ind, int n, int cap , int[][][] dp){
        if(cap==0||ind ==n){
            return 0;
        }
        int op1=0;
        int op2=0;
        if(dp[ind][buy][cap]!=-1){
            return dp[ind][buy][cap];
        }
        if(buy==0){
        op1= 0+solve(arr, 0, ind+1, n, cap,dp);
        op2= -arr[ind]+solve(arr, 1, ind+1, n, cap, dp);
        }
        if(buy==1){
            op1=0+solve(arr, 1, ind+1, n, cap,dp);
            op2=arr[ind]+solve(arr, 0, ind+1, n, cap-1, dp);

        }
        dp[ind][buy][cap]=Math.max(op1, op2);
        return Math.max(op1, op2);
    }
}