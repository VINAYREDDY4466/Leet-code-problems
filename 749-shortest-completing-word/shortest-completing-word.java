class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] count = new int[26];
        for (char c:licensePlate.toCharArray()){
            if (c>='a'&& c<='z')
                count[c-'a']++;
            else if (c>='A' && c<='Z')
                count[c-'A']++;
        }
        int len = Integer.MAX_VALUE;
        String res = "";
        for (String s:words){
            if (s.length()<len && isComp(s, count)){
                res = s;
                len = s.length();
            }
        }
        return res;
    }
    private boolean isComp(String s, int[] count){
        int[] curr = new int[26];
        for (char c:s.toCharArray())
            curr[c-'a']++;
        
        for (int i=0; i<curr.length; i++){
            if (curr[i]<count[i]) return false;
        }
        return true;
    }
}