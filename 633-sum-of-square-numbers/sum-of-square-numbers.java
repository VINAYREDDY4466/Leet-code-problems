class Solution {
    public boolean judgeSquareSum(int c) {
       
        int low=0;
        int high=(int) Math.sqrt(c);
        while(low<=high){
            long check= (long)low*low+ (long)high*high;
            if(check==c){
                return true;
            }
            else if(check>c){
                high--;
            }
            else{
                low++;
            }

        }
        return false;
    }
}