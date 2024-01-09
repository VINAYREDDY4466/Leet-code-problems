class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n =nums.length;
        int count=0;
        int ans=0;
        for(int i=0;i<n;i++){
        if(n==1){
            return nums[i];
        }
       if(i==0){
           if(nums[i]!=nums[i+1]){
               return nums[i];
           }
        }
        else if(i==n-1){
            if(nums[i]!=nums[i-1]){
                return nums[i];
            }
        }
        else{
            if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        

        
    }
    return -1;
}
}