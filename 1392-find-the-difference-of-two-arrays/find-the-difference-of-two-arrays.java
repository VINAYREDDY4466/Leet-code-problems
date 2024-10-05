class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> ans1= new HashSet<>();
        HashSet<Integer> ans2= new HashSet<>();
        for(int i: nums1){
            ans1.add(i);

        }
        for(int i : nums2){
            ans2.add(i);
        }
        List<Integer> res1=new ArrayList<>();
        List<Integer> res2=new ArrayList<>();
        for(int i : nums1){
            if(!ans2.contains(i)&&!res1.contains(i)){
                res1.add(i);
            }
        }
        for(int i: nums2){
            if(!ans1.contains(i)&&!res2.contains(i)){
                res2.add(i);
            }
        }
        List<List<Integer>> res= new ArrayList<>();
        res.add(res1);
        res.add(res2);
        return res;
    }
}