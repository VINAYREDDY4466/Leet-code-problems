class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];

        // Initialize the result array with -1
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        // If the window size is larger than the array, return the result as it is
        if (2 * k + 1 > n) {
            return ans;
        }

        long sum = 0;
        // Calculate the initial sum of the first window of size 2k + 1
        for (int i = 0; i < 2 * k + 1; i++) {
            sum += nums[i];
        }

        // Slide the window across the array
        for (int i = k; i < n - k; i++) {
            // Calculate the average for the current window
            ans[i] = (int) (sum / (2 * k + 1));

            // Slide the window to the right
            if (i + k + 1 < n) {
                sum -= nums[i - k];  // Remove the element going out of the window
                sum += nums[i + k + 1];  // Add the new element coming into the window
            }
        }

        return ans;
    }
}
