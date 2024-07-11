class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> ans= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ans.put(nums[i], ans.getOrDefault(nums[i],0)+1);
        }
        for(int Key: ans.keySet()){
            if(ans.get(Key)>1){
                return true;
            }
        }
        return false;
    }
}