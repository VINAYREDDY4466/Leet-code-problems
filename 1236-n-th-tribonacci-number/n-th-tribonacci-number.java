class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        int[] fb= new int[n+1];
        fb[0]=0;
        fb[1]=1;
        fb[2]=1;
        for(int i=3;i<=n;i++){
            fb[i]=fb[i-1]+fb[i-2]+fb[i-3];
        }
        return fb[n];
    }
}