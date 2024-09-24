
class Solution {
    public int solve(int ind1, int ind2, String s1, String s2, int[][] dp){
         for(int i=0;i<=ind1;i++){
            dp[i][0]=0;
         }
         for(int j=0; j<=ind2;j++){
            dp[0][j]=0;
         }
        for(int i=1; i<=ind1; i++){
            for(int j=1; j<=ind2; j++){
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            dp[i][j] = 1+ dp[i-1][j-1];
        }
        else{
            dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
        
        }
        }

        }
        return dp[ind1][ind2];
        
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n1= text1.length();
        int n2= text2.length();
        int dp[][]= new int[n1+1][n2+1];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        int ans =solve(n1, n2, text1, text2,dp);
        return ans;
    }
}