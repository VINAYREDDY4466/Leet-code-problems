class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
       int n= batteryPercentages.length;
       int ans=0;
       int minus=0;
       for(int i=0;i<n;i++){
           if((batteryPercentages[i]-minus)>0){
               ans++;
               minus++;
           }
       }
       return ans;
    }
}