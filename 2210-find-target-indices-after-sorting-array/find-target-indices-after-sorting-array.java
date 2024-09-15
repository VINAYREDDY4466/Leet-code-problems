class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> ans= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans.add(i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}