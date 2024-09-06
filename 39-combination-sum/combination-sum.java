class Solution {
    public static void findcombinations(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> ds ){
        if(index==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return ;
        }
        if(candidates[index]<=target){
           ds.add(candidates[index]);
            findcombinations(index, candidates ,target-candidates[index],ans,ds);
            ds.remove(ds.size()-1);
        }
        findcombinations(index+1, candidates, target, ans, ds);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         ArrayList<List<Integer>> ans = new ArrayList<>();
         int index=0;
         findcombinations(index, candidates, target, ans,  new ArrayList<Integer>());
         return ans;
    }
}