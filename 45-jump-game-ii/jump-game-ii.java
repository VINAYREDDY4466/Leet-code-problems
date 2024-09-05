class Solution {
    public int jump(int[] nums) {
        int n= nums.length;
        int min=0;
        int c=0;
        if(n<=1){
            return 0;
        }
        int cur=0;
        for(int i=0;i<n;i++){
            min=Math.max(min, nums[i]+i);
            if(i==cur){
                c++;
                cur=min;
                if(cur>=n-1){
                    break;
                }
            }
            
        }
        return c;
    }
}