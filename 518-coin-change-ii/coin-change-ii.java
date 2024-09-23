class Solution {
    public int solve (int[] arr, int ind, int target , int [][] dp){
        if(ind==0){
            if(target%arr[0]==0){
                return 1;
            }
            return 0;
           
        }
        if(dp[ind][target]!=-1){
            return dp[ind][target];
        }
        int nottake =solve(arr, ind-1, target, dp);
        int take=0;
        if(arr[ind]<=target){
            take= solve(arr, ind, target-arr[ind], dp);
        }
        dp[ind][target]=take+nottake;
        return dp[ind][target];
    }
    public int change(int amount, int[] arr) {
        int n=arr.length;
        int[][] dp = new int[n][amount+1];
        for(int row[] : dp){
            Arrays.fill(row, -1);
        }
        int ans =solve(arr, n-1, amount, dp);
        return ans;


    }
}