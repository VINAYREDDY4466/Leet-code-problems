class Solution {
    public boolean solve (int index, int[] arr, int[][]  dp, int target){
        if(target==0){
           return true;
        }
        if(index==0){
            return arr[index]==target;
        }
        if(dp[index][target]!=-1){
            return dp[index][target]==0? false:true;
        }
        boolean nottake= solve(index-1, arr, dp, target);
        boolean take= false;
        if(arr[index]<=target){
            take= solve(index-1, arr, dp, target-arr[index]);
        }
        dp[index][target]=nottake||take?1:0;
        return nottake||take;
    }
    public boolean canPartition(int[] nums) {
        int n= nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            k+=nums[i];
        }
        if(k%2!=0){
            return false;
        }
        int t= k/2;
        int[][] dp = new int[n][k+1];
         for(int row[]: dp){
            Arrays.fill(row, -1);
         }
         boolean ans= solve(n-1, nums, dp, t);
         return ans;
    }

}