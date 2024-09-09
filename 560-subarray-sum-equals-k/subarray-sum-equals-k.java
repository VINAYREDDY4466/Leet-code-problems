class Solution {
   
    public int subarraySum(int[] nums, int k) {
     HashMap<Integer, Integer> ans = new HashMap<>();
        
        // Variable to store the cumulative sum
        int presum = 0;
        
        // Variable to count the number of subarrays with sum k
        int count = 0;
        
        // Initialize the map with the base case: 0 sum occurs once
        ans.put(0, 1);
        
        // Iterate over the array
        for(int i = 0; i < nums.length; i++){
            // Update the cumulative sum with the current element
            presum += nums[i];
            
            // Calculate the value needed to remove from presum to get k
            int remove = presum - k;
            
            // If the value (presum - k) exists in the map, it means there is a subarray with sum k
            count += ans.getOrDefault(remove, 0);
            
            // Add the current presum to the map (or update its count if it already exists)
            ans.put(presum, ans.getOrDefault(presum, 0) + 1);
        }
        
        // Return the total count of subarrays with sum k
        return count;
    }
}