class Solution {
    public static void findcomb(int index, int[] arr, int k , int n, Set<List<Integer>> ans, List<Integer> ds){
       if(index==arr.length){
        if(n==0){
            ans.add(new ArrayList<>(ds));

        }
        return ;
       }
       if(arr[index]<=n){
          ds.add(arr[index]);
          findcomb(index+1, arr, k, n-arr[index], ans,ds);
          ds.remove(ds.size()-1);
       }
       findcomb(index+1, arr, k,n, ans, ds );


    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        Set<List<Integer>> ans = new HashSet<>();
        int index=0;
        findcomb(index, arr, k, n, ans, new ArrayList<Integer>());
        List<List<Integer>> ans2 = new ArrayList<>();
   for( List<Integer> i : ans){
      if(i.size()==k){
        ans2.add(i);
      }
   }
        return ans2;

    }
}