class Solution {
    public boolean solve (int index, int[] arr, int target){
        boolean dp[][]=  new boolean[index][target+1];
        for(int i =0; i<index;i++){
            dp[i][0]=true;
        }
        if(arr[0]<=target){

         dp[0][arr[0]]=true;
        }
        for(int i= 1; i< index;i++){
            for(int tar =1; tar<=target;tar++){
                boolean nottake = dp[i-1][tar];
                boolean take =false;
                if(arr[i]<=tar){
                    take =dp[i-1][tar-arr[i]];
                }
                dp[i][tar]= nottake||take;
            }
        }
        return dp[index-1][target];
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
         boolean ans= solve(n, nums, t);
         return ans;
    }

}