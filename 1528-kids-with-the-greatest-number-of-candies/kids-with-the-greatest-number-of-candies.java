class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans= new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            max= Math.max(candies[i],max);
        }
        for(int i: candies){
            int sum = i+extraCandies;
            if(sum>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }

        }
        return ans;

    }
}