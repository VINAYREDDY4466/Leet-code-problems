class Solution {
    public int solve(int[] arr , int [] dp, int ind){
        if(ind<0){
            return 0;
        }
        if(ind==0){
            return arr[ind];

        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int pick= arr[ind]+ solve(arr, dp, ind-2);
        int notpick= solve(arr, dp ,ind-1);
        return dp[ind] =Math.max(pick, notpick);
    }
    public int rob(int[] arr) {
        int n= arr.length;
        int[] dp= new int[n];
        Arrays.fill(dp, -1);
        int ans= solve(arr, dp, n-1);
        return ans;
    }
}