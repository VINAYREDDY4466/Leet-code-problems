class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int i: nums){
            ans.put(i, ans.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: ans.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return 0;
    }
}