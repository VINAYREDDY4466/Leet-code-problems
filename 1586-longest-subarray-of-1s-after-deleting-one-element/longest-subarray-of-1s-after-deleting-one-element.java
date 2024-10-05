class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int k=1;
        int l=0;
        int r=0;
        int zeros=0;
        int maxlen=0;
        while(r<n){
            if(nums[r]==0){
                zeros++;
            }
            while(zeros>k){
                if(nums[l]==0){
                    zeros--;
                }
                l++;
            }
            maxlen =Math.max(maxlen, r-l+1);
            r++;
        }   
        return maxlen-1;
    }
}