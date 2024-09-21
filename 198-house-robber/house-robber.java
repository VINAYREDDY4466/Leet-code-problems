class Solution {
   
    public int rob(int[] arr) {
       int n=arr.length;
       int[] dp= new int[n+1];
       dp[0]=arr[0];
       int notpick= Integer.MAX_VALUE;
       for(int i=1;i<n;i++){
          int pick=arr[i];
          if(i>1){
            pick += dp[i-2];
          }
          notpick =dp[i-1];
          dp[i]=Math.max(pick, notpick);
       }
       return dp[n-1];
    }
}