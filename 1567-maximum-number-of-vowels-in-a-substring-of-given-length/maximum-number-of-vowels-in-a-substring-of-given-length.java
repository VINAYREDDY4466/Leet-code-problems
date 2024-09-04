class Solution {
    public int maxVowels(String s, int k) {
        int vowelcount=0;
        for(int i=0;i<k;i++){
            if(checkvowel(s.charAt(i))){
                vowelcount++;
            }
        }
        int maxvowel=0;
        maxvowel=vowelcount;
        for(int i=k;i<s.length();i++){
            if(checkvowel(s.charAt(i))){
                vowelcount++;
            }
            if(checkvowel(s.charAt(i-k))){
                vowelcount--;
            }
            maxvowel= Math.max(maxvowel, vowelcount);
        }
        return maxvowel;
    }
    public static boolean checkvowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';  
    }
}