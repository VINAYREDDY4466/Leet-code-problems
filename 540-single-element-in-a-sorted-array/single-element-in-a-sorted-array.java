class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> ans= new HashMap<>();
        for(int i =0;i<nums.length;i++){
            ans.put(nums[i], ans.getOrDefault(nums[i],0)+1);
        }
       for(int key: ans.keySet()){
        if(ans.get(key)==1){
            return key;
        }
       }
        

        return -1;
    }
    

}