class Solution {
    public int largestAltitude(int[] arr) {
        int sum = 0; // Initial altitude
        int maxAltitude = 0; // Track the maximum altitude
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Update the current altitude after the change
            maxAltitude = Math.max(maxAltitude, sum); // Track the highest altitude
        }
        
        return maxAltitude;
    }
}
