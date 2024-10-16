class Solution {
    public boolean isPerfectSquare(int num) {
        int low=1;
        int high =num;
        while(low<=high){
           int mid = low + (high - low) / 2; 
            long n=(long)mid*mid;
            if(n==num){
                return true;

            }
            else if(n>num){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}