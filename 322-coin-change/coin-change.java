class Solution {
    public int solve(int[] arr , int index, int amount,int[][] dp ){
       
        if(index==0){
            if(amount%arr[0]==0){
                return amount/arr[0];
            }
            else{
                return (int) Math.pow(10, 9);
            }
        }
        if(dp[index][amount]!=-1){
            return dp[index][amount];
        }
        int nottake = solve(arr, index-1, amount, dp);
        int take= (int) Math.pow(10, 9);
        if(arr[index]<=amount){
            take= 1 + solve(arr, index, amount-arr[index], dp);
        }
        dp[index][amount]=Math.min(nottake , take);
        return dp[index][amount];

    }
    public int coinChange(int[] arr, int amount) {
       int n= arr.length;
       
       int[][] dp = new int[n][amount+1];
       for( int row[]:dp){
        Arrays.fill(row, -1);
       }
       int ans= solve(arr, n-1, amount,dp);
         if (ans >= (int) Math.pow(10, 9))
            return -1;
    
       return ans;
        
    }
}