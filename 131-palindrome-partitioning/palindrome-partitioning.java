class Solution {
    public static void findpartition(int index, String s, List<List<String>> res, List<String> path){
        if(index==s.length()){
            res.add(new ArrayList<>(path));
            return ;
        }
        for(int i=index;i< s.length();i++){
            if(checkpalin(s,index, i)){
                path.add(s.substring(index, i+1));
                findpartition(i+1, s, res, path);
                path.remove(path.size()-1);
            }
        }
         
    }
    public static Boolean checkpalin(String s, int start, int end)
        {
            while(start<=end){
                if(s.charAt(start++)!=s.charAt(end--)){
                    return false;
                }
            }
            return true;
        }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        int index=0;
        findpartition(index, s, res, path);
        return res;
    }
 } 
 