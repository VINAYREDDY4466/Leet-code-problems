class Solution {
    public void sortColors(int[] nums) {
       int low=0;
       int high=nums.length-1;
       int mid =0;
       while(mid<=high){
          switch(nums[mid]){
            case 0: {
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
                break;

            }
            case 1: {
                mid++;
                break;
            }
            case 2:{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
                break;
            }
          }
       }
    }
}