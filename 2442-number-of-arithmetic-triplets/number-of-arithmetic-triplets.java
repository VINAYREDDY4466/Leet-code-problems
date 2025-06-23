class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n= nums.length;
        int c=0;
        int left=0;
        while(left<n-2){
           int left1=left+1;
           while(left1<n-1){
            int left2= left1+1;
            while(left2<n){
                if(countTriplet(left,left1, left2, diff, nums)){
                    c++;
                }
                left2++;
            }
            left1++;
           }
           left++;
        }
        return c;
    }
    public boolean countTriplet(int i, int j,int k, int diff, int[] arr){
          if(arr[j]-arr[i]==diff && arr[k]-arr[j]==diff){
             return true;
          }
          return false;
    }
}