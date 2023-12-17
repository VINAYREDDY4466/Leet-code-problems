class Solution {
    public boolean isPalindrome(int x) {
      if(x<0){
          return false;
      }
      long temp=x;
      long digt=0;
      while(temp!=0){
          int digit= (int )(temp%10);
          digt=digt*10+digit;
          temp/=10;
      }
      return (digt==x);
      
    }
}