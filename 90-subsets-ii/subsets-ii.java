class Solution {
    public static void findsubsets(int index, int[] nums, Set<List<Integer>> ans, List<Integer> ds){
        if(index==nums.length){
            ans.add(new ArrayList<>(ds));
            return ;
        }
        ds.add(nums[index]);
        findsubsets(index+1, nums,ans, ds);
        ds.remove(ds.size()-1);
        findsubsets(index+1, nums, ans, ds);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> ans= new HashSet<>();
        int index=0;
        Arrays.sort(nums);
        ans.add(new ArrayList<>());
        findsubsets(index, nums, ans, new ArrayList<>());
        ArrayList<List<Integer>>  ans2= new ArrayList<>();
        for(List<Integer> i: ans){
            ans2.add(i);
        }
        return ans2;


    }
}