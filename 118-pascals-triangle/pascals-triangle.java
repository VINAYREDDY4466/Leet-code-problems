class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> num= new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    num.add(1);
                }
                else{
                    int a= ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    num.add(a);
                }
               
            }
            ans.add(num);
            
        }
        return ans;
    }
    
}