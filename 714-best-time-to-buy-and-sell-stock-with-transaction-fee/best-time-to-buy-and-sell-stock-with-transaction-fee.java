class Solution {
    public int maxProfit(int[] arr, int fee) {
        int n= arr.length;
        int[][]  dp = new int[n+1][2];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        int ans= solve(arr, 0, 0, n,fee, dp);
        return ans;
    }
    public int solve(int[] arr, int ind, int buy,int n, int fee, int[][] dp){
       if(ind==n){
        return 0;
       }
       if(dp[ind][buy]!=-1){
        return dp[ind][buy];
       }
       int op1=0;
       int op2=0;
       if(buy==0){
         op1=-arr[ind]+solve(arr, ind+1, 1, n, fee, dp);
         op2= 0+ solve(arr, ind+1, 0, n,fee, dp);
       }
       if(buy==1){
        op1= arr[ind]-fee+solve(arr, ind+1, 0,n, fee, dp);
        op2= 0+ solve(arr, ind+1, 1, n,fee, dp);
       }
       return dp[ind][buy]=Math.max(op1, op2);
    }
}