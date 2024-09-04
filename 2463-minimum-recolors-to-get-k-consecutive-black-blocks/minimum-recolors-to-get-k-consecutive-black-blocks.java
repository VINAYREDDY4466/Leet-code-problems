class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int result=101;
        int n=blocks.length();
        
        
        for(int i=0;i+k-1<n;i++){                          //   i+k-1   ->  Maintain Window of Size k 
           
            int requiredBlackBlock=0;
            
            for(int j=i;j<=i+k-1;j++){                     //   Get the currentWindow requiredBlackBlock
                
            if(blocks.charAt(j)== 'W')
            requiredBlackBlock++;
            }
            if(requiredBlackBlock==0)                      //   if requiredBlackBlock = 0 -> return 0
            return 0;
            
            result=Math.min(result,requiredBlackBlock);    // Keep min requiredBlackBlock in result
        }
            
       return result;
    }
           
}