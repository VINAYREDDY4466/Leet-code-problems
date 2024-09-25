class Solution {
    public int lengthOfLIS(int[] arr) {
        int n=arr.length;
        int prev=-1;
        int[][]  dp = new int[n][n+1];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }

        int ans= solve(arr, -1, 0,n, dp);
        return ans;     
    }
    public int solve(int[] arr, int prev, int ind,int n,int[][]  dp){
        if(ind==n){
            return 0;
        }
        if(dp[ind][prev+1]!=-1){
            return dp[ind][prev+1];
        }
        int nottake= 0+ solve(arr, prev, ind+1, n, dp);
        int take=0;
        if(prev==-1|| arr[ind]>arr[prev]){
            take=  1+solve(arr, ind, ind+1, n, dp);
        }
        return dp[ind][prev+1]=Math.max(nottake, take);
    }
}