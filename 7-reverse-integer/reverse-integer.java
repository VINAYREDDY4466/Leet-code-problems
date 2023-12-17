class Solution {
    public int reverse(int x) {
        int h= Integer.MAX_VALUE;
        int k=Integer.MIN_VALUE;
        long ans=0;
        while(x!=0){
            ans=ans*10+x%10;
            x=x/10;
        }
        if(ans>h||ans<k){
            return 0;
        }
        else{
            return (int) ans;
        }
        
    }
}