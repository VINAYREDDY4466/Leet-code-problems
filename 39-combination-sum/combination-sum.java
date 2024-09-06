class Solution {
    public static void findcombinations(int index, int[] candidates, int target, Set<List<Integer>> ans, List<Integer> ds ){
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
         HashSet<List<Integer>> ans = new HashSet<>();
         int index=0;
         findcombinations(index, candidates, target, ans,  new ArrayList<Integer>());
         List<List<Integer>> ans2= new ArrayList<>();
         for(List<Integer> i: ans){
              ans2.add(new ArrayList<>(i));
         }
         return ans2;
    }
}