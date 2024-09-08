class Solution {
    public int minimumDeletions(String s) {
        int ans=0;
        int countB=0;
        for(char i: s.toCharArray()){
           if(i=='a'){
            ans= Math.min(ans+1, countB);
           }
           else{
            countB++;
           }
        }
        return ans;
    }
}