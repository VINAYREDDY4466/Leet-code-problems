class Solution {
    public static void findsubsets(int index, int[] arr , Set<List<Integer>> ans, List<Integer> ds){
        if(index==arr.length){
            ans.add(new ArrayList<>(ds));
            return ;
        } 
        ds.add(arr[index]);
        findsubsets(index+1, arr, ans,ds);
        ds.remove(ds.size()-1);
        findsubsets(index+1, arr, ans, ds);
      
    }
    public List<List<Integer>> subsets(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        int index=0;
        findsubsets(index, nums, ans, new ArrayList<Integer>());
        List<List<Integer>> ans2= new ArrayList<>();
        for(List<Integer> i:ans){
            ans2.add(i);
        }
        return ans2;
    }
}