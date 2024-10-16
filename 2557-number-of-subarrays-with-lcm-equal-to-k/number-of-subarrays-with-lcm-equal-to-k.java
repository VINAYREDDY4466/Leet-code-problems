class Solution {
    public int subarrayLCM(int[] nums, int k) {
         int c = 0;
        
        // Iterate over each subarray starting point
        for (int i = 0; i < nums.length; i++) {
            int currentLCM = nums[i];  // Initialize current LCM with the starting element
            
            // Iterate over each subarray ending point
            for (int j = i; j < nums.length; j++) {
                currentLCM = lcm(currentLCM, nums[j]);  // Update LCM for the current subarray
                
                // If the current LCM equals k, increment the count
                if (currentLCM == k) {
                    c++;
                }
                
                // If the current LCM exceeds k, we can stop checking further elements for this subarray
                if (currentLCM > k) {
                    break;
                }
            }
        }

        return c;
    }
     public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);  // LCM formula using GCD
    }

    // Function to calculate GCD of two numbers
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
   
}