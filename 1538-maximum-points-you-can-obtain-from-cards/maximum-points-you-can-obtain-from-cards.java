class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int lsum=0;
       int rsum=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        int maxsum=lsum;
        int l=0;
        int r=cardPoints.length-1;
       for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            rsum= rsum+cardPoints[r];
            r=r-1;
            maxsum=Math.max(maxsum, lsum+rsum);
            }
        return maxsum;
    }
}