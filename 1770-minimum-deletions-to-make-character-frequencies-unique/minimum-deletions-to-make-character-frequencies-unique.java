class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> ans = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            ans.put(c, ans.getOrDefault(c,0)+1);
        }
        int c=0;
        HashSet<Integer> check= new HashSet<>();
       for(int freq: ans.values()){
         while(freq>0&& check.contains(freq)){
            freq--;
            c++;
         }
         check.add(freq);
       }
        return c;
        
    }
}