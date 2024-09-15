class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> ans= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ans.put(nums[i], ans.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: ans.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return nums[0];
    }
    

}