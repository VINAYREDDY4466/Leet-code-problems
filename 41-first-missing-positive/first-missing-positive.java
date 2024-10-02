class Solution {
    public int firstMissingPositive(int[] nums) {
       int max=0;
       HashMap<Integer, Integer> ans= new HashMap<>();
       for(int i=0;i<nums.length;i++){
        max = Math.max(max, nums[i]);
        ans.put(nums[i], 1);
       }
       for(int i=1; i<=max;i++){
           if(!ans.containsKey(i)){
            return i;
           }
       }
       return max+1;
    }
}