class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> hp1 = new HashSet<>();   
        HashSet<Integer> hp2 = new HashSet<>();   

        int n = nums1.length;
        int m = nums2.length;

        for(int i=0; i<n; i++){
            hp1.add(nums1[i]);
        }

        
        for(int i=0; i<m; i++){
            hp2.add(nums2[i]);
        }

        int ans[] = new int[]{0,0};
        int count1=0;
        int count2=0;

        for(int i=n-1; i>=0; i--){
            if(hp2.contains(nums1[i])){
                count1++;
            }
        }

        
        for(int i=m-1; i>=0; i--){
            if(hp1.contains(nums2[i])){
                count2++;
            }
        }
        ans[0] = count1;
        ans[1] = count2;
        return ans;
    }
}