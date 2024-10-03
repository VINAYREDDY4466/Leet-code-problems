class Solution {
    public int maxOperations(int[] arr, int k) {
      Arrays.sort(arr);
       int left=0;
       int right= arr.length-1;
       int c=0;
       while(left<right){
           if(arr[left]+arr[right]==k){
            c++;
            left++;
            right--;

           }
           else if(arr[left]+arr[right]<k){
            left++;
           }
           else{
            right--;
           }
       }
       return c;
    }
}