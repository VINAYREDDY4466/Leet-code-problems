class Solution {
    public int maxProfit(int[] arr) {

       int ans=0;
       int stock=arr[0];
       for(int i=1; i<arr.length;i++){
             if(arr[i]<stock){
                stock =arr[i];
             }
             if(arr[i]>arr[i-1]){
                int profit =arr[i]-stock;
                ans+=profit;
                stock=arr[i];
             }
       }


        return ans;
    }
}