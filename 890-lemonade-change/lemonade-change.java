class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int i : bills){
            if( i==5){
                five++;
            }
            else if(i==10){
                if(five>0){
                    ten++;
                    five--;
                }
                else {
                    return false;
                }
            }
            else{
                if(five>0&&ten>0){
                    ten--;
                    five--;
                }
                else if(five>=3){
                    five-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}